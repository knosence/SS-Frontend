// to crete a service, use ng g service
// remember that Angular tacks on .service to the name
// so just us the name without any mention of service

// an injectable is something Angular can insert wherever we need it
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { User } from '../models/user';

// services have the @Injectable() decorator
@Injectable({
  providedIn: 'root',
})

// still a class, still exported
// we can use a service to do and/or hold anything
// we want to access in a non-parent/child way
export class UserService {
  constructor() { }

  // an array of pre-existing users we can add to as people register
  users: User[] = [
    new User('Raymond', 'Hernandez', 'numberonealcoholic@aa.com', 'tequila1'),
    new User('Brian', 'Parmalee', 'thebigcheezel@aol.com', 'cheezeplz'),
    new User('admin', 'istrator', 'admin@gmail.com', 'tsinimda'),
  ]


  // a behavorSubject is something whose state change is tracted
  // as if shifts from one thing to another
  private currentUser = new BehaviorSubject<User>(new User('', '', '', ''));

  // this sets up the user variable to refer to the contents
  // of the userSubject variable as somethiing whose changes 
  // we can watch and respond to
  user = this.currentUser.asObservable();

  // getUserSubject(): any {
  //   return this.currentUser.asObservable();
  // }

  // to update the data inside the BehaviorSubject
  loginUser(newUser: User): void {
    //this takes the input object
    // and stores it as the next state of the subject
    this.currentUser.next(newUser);

  }

  logoutUser(): void {
    this.currentUser.next(new User('', '', '', ''));
  }

  // to add a user to our array for future login
  // using our new class as a parameter type
  registerUser(newUser: User) {
    this.users.push(newUser);
  }

  // we CAN set up and grab values from varables as normal
  // BUT it's more difficult to respond to changes
  // userVariable: any = {
  //   firstName: 'Default',
  //   lastName: 'User',
  //   email: '123@abc.com',
  //   password: '12345',
  //   confirmPassword: '12345',
  // };

  addToFavorites(cocktail: any): void {
    // find our user in the array
    for (let user of this.users) {
      if (user.email === this.currentUser.value.email) {
        user.favorites.push(cocktail);
        // this.currentUser.next(user);
      }
    }
  }

  // to remove a drink from the current usser's favorites
  removeFromFavorites(cocktail: any ) {
    for (let user of this.users) {
      if (user.email === this.currentUser.value.email) {
        user.favorites.splice(user.favorites.indexOf(cocktail), 1);
      }
    }
  }

}
