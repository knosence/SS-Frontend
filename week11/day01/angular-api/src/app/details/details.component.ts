import { Component } from '@angular/core';
import { CocktailService } from '../services/cocktail.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css'],
})
export class DetailsComponent {
  pipeString: string = 'aBcEdFgHiJkLmNoPqRsTuVwXyZ aBc XyZ';
  // for the date pipe, the input format can vary
  pipeDate: string = '2022-12-14';

  rawCocktail: any = {};
  cocktail: any = {};

  constructor(private cocktailService: CocktailService) {
    // this.cocktailService.getRandom().subscribe((data) => {
    //   this.rawCocktail = data.body.drinks[0];
    //   this.cleanCocktail();
    // });
  
    //easy way
    // this.rawCocktail = this.cocktailService.detailsCocktail;
    // this.cleanCocktail();

    // better way
    this.cocktailService.detailsCocktailObserversble.subscribe(data => {
      this.rawCocktail = data;
      this.cleanCocktail();
    })

  }

  cleanCocktail(): void {
    for (let property in this.rawCocktail) {
      if (this.rawCocktail[property]) {
        this.cocktail[property] = this.rawCocktail[property];
      }
    }
  }
}
