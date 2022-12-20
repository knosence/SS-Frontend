import { Component } from '@angular/core'
import { Router } from '@angular/router';
import { CocktailService } from '../services/cocktail.service'
import { UserService } from '../services/user.service'

@Component({
  selector: 'app-cocktails',
  templateUrl: './cocktails.component.html',
  styleUrls: ['./cocktails.component.css'],
})
export class CocktailsComponent {
  cocktails: any = [];
  tempCocktails:any= [];
  currentUserFavorites: any = []

  firstLetterToSearch: string = ''

  stringToSearch: string = ''

  constructor(
    private cocktailService: CocktailService,
    private userService: UserService,
    private router: Router
  ) {
    // here we subscribe to the return of a method
    this.cocktailService.getRandom().subscribe((data) => {
      // seeing what's in the response
      console.log(data.body.drinks)
      // assigning the desired protion of the response to our local variable
      this.cocktails = data.body.drinks
    })

    this.userService.user.subscribe((data) => {
      this.currentUserFavorites = data.favorites
    })
  }

  // function to display a random cocktail
  displayRandom() {
    this.cocktailService.getRandom().subscribe((data) => {
      console.log(data.body.drinks)
      this.cocktails = data.body.drinks
    })
  }

  // function to display the results of our service's getByFirstLetter function
  searchByFirstLetter(): void {
    this.cocktailService.getBytFirstLetter(this.firstLetterToSearch).subscribe(
      // handling errors in our GET requiest

      // these observe arguments
      // one object with different properties for success/failure
      {
        // next is for a successful response
        // you MUST use next
        next: (data) => {
          console.log(data)
          this.cocktails = data.body.drinks
        },
        // error is for a failed attempt
        // you MUST use error
        error: (err) => {
          console.log(err)
          // you still have access to the properties of the HttpErrorResponse object
          console.log(err.status)
          this.cocktails = null
        },
        // complete is for a void-return completion
        // you MUST use complete
        // you have to take in on parameters for this one
        complete: () => {
          console.log("It's over!")
        },
      },

      //THIS IS THE DEPRECATED (but still functional) WAY TO DO IT
      // first call back function is for a successfull operation
      // the name of the variables, in this case, do not mater, just the order
      //   success => {
      //   console.log(success)
      //   this.cocktails = success.body.drinks;
      // },
      // // second one is for a failed operation
      // failure => {
      //   console.log(failure);
      //   console.log(failure.status)
      //   this.cocktails = null;
      // }
    )
    this.firstLetterToSearch = ''
  }

  // function to display results of our services's getBySearchString function
  searchByString(): void {
    this.cocktailService
      .getBySearchString(this.stringToSearch)
      .subscribe((data) => {
        console.log(data)
        this.cocktails = data.body.drinks;
        this.stringToSearch = '';
      })
  }

  // function to display results of our services's getByAlcoholic function
  searchByAlcoholic(alcoholic: boolean): void {
    this.cocktailService.getByAlcoholic(alcoholic).subscribe((data) => {
      this.tempCocktails = [];
      // console.log(data)
      for (let drink of data.body.drinks) {
        this.cocktailService.getById(drink.idDrink).subscribe(data => {
          this.tempCocktails.push(data.body.drinks[0]);
        })
      }

      this.cocktails = this.tempCocktails;
    })
  }



  //fucntion to add to the user's favorites
  addToFavorites(cocktail: any): void {
    if (!this.currentUserFavorites.includes(cocktail))
      this.userService.addToFavorites(cocktail)
  }

  // function to remove from the user's favorites
  removeFromFavorites(cocktail: any): void {
    this.userService.removeFromFavorites(cocktail);
  }

  // function to get cocktail details
  getDetails(cocktail: any) {
    this.cocktailService.updateDetailCocktail(cocktail);
    this.router.navigate(['../details'])
  }

}
