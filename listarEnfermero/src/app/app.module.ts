import { MatMenuModule } from '@angular/material/menu';
import { MatToolbarModule } from '@angular/material/toolbar';
import { EnfermeroListarComponent } from './page/enfermero/enfermero-listar/enfermero-listar.component';
import { EnfermeroTableComponent } from './componets/enfermero-table/enfermero-table.component';
import { EnfermeroComponent } from './page/enfermero/enfermero.component';
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
import { EnfermeroCreaeditaComponent } from './page/enfermero/enfermero-creaedita/enfermero-creaedita.component';
import { EnfermeroDialogoComponent } from './page/enfermero/enfermero-listar/enfermero-dialogo/enfermero-dialogo.component';
import { MatDialogModule } from '@angular/material/dialog';
import { EnfermeroBuscarComponent } from './page/enfermero/enfermero-buscar/enfermero-buscar.component';
import { EnfermeroDetailComponent } from './componets/enfermero-detail/enfermero-detail.component';
@NgModule({
  declarations: [
    AppComponent,
    EnfermeroComponent,
    EnfermeroTableComponent,
    EnfermeroCreaeditaComponent,
    EnfermeroCreaeditaComponent,
    EnfermeroListarComponent,
    EnfermeroDialogoComponent,
    EnfermeroBuscarComponent,
    EnfermeroDetailComponent
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
    MatDialogModule,
    MatToolbarModule,
    MatMenuModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
