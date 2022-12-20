import { Injectable } from '@angular/core';
// need these two imports for HTTP requests
// Client is what allows us to make them
// Response is what allows us to handle what comes back
import { HttpClient, HttpResponse } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CocktailService {

  url: string = environment.apiURL;
  private detailsCocktail = new BehaviorSubject<any>({});
  detailsCocktailObserversble = this.detailsCocktail.asObservable();

  constructor(private httpClient: HttpClient) { }

  // function to get one random cocktail from the API 
  // and load it into our coctail variable
  // returns an Observble HTTPResponse 
  getRandom(): Observable<HttpResponse<any>> {
    const randomURL = this.url + 'random.php';
    return this.httpClient.get<any>(randomURL, { observe: 'response' });
  }

  // function to get all cocktails with the first letter a
  // the api doesn't care about case... in this case
  getBytFirstLetter(firstLetter: string): Observable<HttpResponse<any>> {
    const firstLetterURL = this.url + 'search.php?f=' + firstLetter;
    return this.httpClient.get<any>(firstLetterURL, { observe: 'response' })
  }

  getBySearchString(searchString: string): Observable<HttpResponse<any>> {
    const searchStringURL = this.url + 'search.php?s=' + searchString;
    return this.httpClient.get<any>(searchStringURL, { observe: 'response' })
  }

  getByAlcoholic(Alcoholic: boolean): Observable<HttpResponse<any>> {
    let alcoholicString = '';
    if (Alcoholic)
      alcoholicString = 'Alcoholic';
    else
      alcoholicString = 'Non_Alcoholic';

    const AlcoholicURL = this.url + 'filter.php?a=' + alcoholicString;
    return this.httpClient.get<any>(AlcoholicURL, { observe: 'response' })
  }

  // function to get an individual cocktail by id
  getById(id: string): Observable<HttpResponse<any>> {
    const idURL = this.url + 'lookup.php?i=' + id;
    return this.httpClient.get<any>(idURL, { observe: 'response' });
  }

  updateDetailCocktail(cocktail: any): void {
    this.detailsCocktail.next(cocktail);
  }

}
