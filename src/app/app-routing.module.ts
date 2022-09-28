import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InteresComponent } from './page/interes.component';
import { InteresCreaeditaComponent } from './page/interes-creaedita/interes-creaedita.component';

const routes: Routes = [
  {
    path: 'intereses', component: InteresComponent, children: [
      { path: 'nuevo', component: InteresCreaeditaComponent },
      { path: 'edicion/:id', component: InteresCreaeditaComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
