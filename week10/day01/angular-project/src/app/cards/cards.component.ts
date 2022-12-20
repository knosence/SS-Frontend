import { Component } from '@angular/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.css'],
})
export class CardsComponent {
  // Typescript wants you to declare variable types
  // do so with a colon after the variable name, then the type

  pokemonList: any = [
    {
      name: 'Charizard',
      type: 'Fire',
      color: 'Burnt Umber',
    },
    {
      name: 'Mimikyu',
      type: 'Ghost',
      color: 'Blanched Almond',
    },
    {
      name: 'Arcanine',
      type: 'Fire',
      color: 'Orange, Cream & Black',
    },
    {
      name: 'Ampharos',
      type: 'Electric',
      color: 'Throw Up'
    }
  ];

  pokemonOneName: string = 'Charizard';
  pokemonOneType: string = 'Fire';
  pokemonOneColor: string = 'Burnt Umber';

  pokemonTwo: any = {
    name: 'Mimikyu',
    type: 'Ghost',
    color: 'Blanched Almond',
  };

  pokemonThree: any = {
    name: 'Arcanine',
    type: 'Fire',
    color: 'Orange, Cream & Black',
  };
  // same thing for function
  // declare function name, then a colon, then the return type
  myMethod(): string {
    console.log('I have a type now!!');
    return '123';
  }

  // a function to change P1's name
  // we must type input parameters aw well, in the same way
  changeName(newName: string): void {
    this.pokemonOneName = newName;
  }

  changeColor(newColor: string): void {
    this.pokemonThree.color = newColor;
  }
  
  addPokemon(name: string, type: string, color: string): void {
    this.pokemonList.push({name: name, type: type, color: color})
  }
}
