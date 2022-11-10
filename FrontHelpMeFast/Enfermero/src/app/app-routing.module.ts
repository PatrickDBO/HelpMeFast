import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EnfermeroComponent } from './page/enfermero/enfermero.component';
import { EnfermeroCreaeditaComponent } from './page/enfermero/enfermero-creaedita/enfermero-creaedita.component';

const routes: Routes = [
  {path: 'enfermeros', component: EnfermeroComponent, children : [
  { path: 'nuevo', component: EnfermeroCreaeditaComponent },
  { path: 'edicion/:id', component: EnfermeroCreaeditaComponent }
]}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
