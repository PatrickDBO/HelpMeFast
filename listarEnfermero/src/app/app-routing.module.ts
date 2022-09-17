import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EnfermeroTableComponent } from './componets/enfermero-table/enfermero-table.component';
import { EnfermeroDetailComponent } from './componets/enfermero-detail/enfermero-detail.component';

const routes: Routes = [
  {path: 'home', component: EnfermeroTableComponent},
  {path: 'enfermeroDetail/:id', component: EnfermeroDetailComponent},
  {path: '', pathMatch: 'full', redirectTo: 'home'},
  {path: '**' , pathMatch: 'full', redirectTo: 'home'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
