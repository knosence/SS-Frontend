import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CocktailsComponent } from './cocktails/cocktails.component';
import { DetailsComponent } from './details/details.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [

  {
    path: '',
    component: LoginComponent  
  },
   {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'cocktails',
    component: CocktailsComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'details',
    component: DetailsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
