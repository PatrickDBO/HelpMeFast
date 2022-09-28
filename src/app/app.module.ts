import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import{MatTableModule} from '@angular/material/table';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import{MatIconModule} from'@angular/material/icon';
import { FormsModule } from '@angular/forms';
import { InteresComponent } from './page/interes.component';
import { InteresListarComponent } from './page/interes-listar/interes-listar.component';
import { InteresCreaeditaComponent } from './page/interes-creaedita/interes-creaedita.component';
import { InteresDialogoComponent } from './page/interes-dialogo/interes-dialogo.component';
import { MatDialogModule } from '@angular/material/dialog';
import { InteresBuscarComponent } from './page/interes-buscar/interes-buscar.component';

@NgModule({
  declarations: [
    AppComponent,
    InteresComponent,
    InteresListarComponent,
    InteresCreaeditaComponent,
    InteresDialogoComponent,
    InteresBuscarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatTableModule,
    MatInputModule,
    FormsModule,
    MatButtonModule,
    MatIconModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
