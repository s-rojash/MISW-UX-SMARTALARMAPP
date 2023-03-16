import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { MatTabsModule} from '@angular/material/tabs';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { AlarmasComponent } from './alarmas/alarmas.component';
import { RecordatorioComponent } from './recordatorio/recordatorio.component';
import { CronometroComponent } from './cronometro/cronometro.component';
import { PerfilComponent } from './perfil/perfil.component';
import { RegistroComponent } from './registro/registro.component';
import { MatExpansionModule } from '@angular/material/expansion';
import { RecuperapassComponent } from './recuperapass/recuperapass.component';
import { SendcodesComponent } from './sendcodes/sendcodes.component';
import { CambiarpassComponent } from './cambiarpass/cambiarpass.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    AlarmasComponent,
    RecordatorioComponent,
    CronometroComponent,
    PerfilComponent,
    RegistroComponent,
    RecuperapassComponent,
    SendcodesComponent,
    CambiarpassComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSlideToggleModule,
    MatTabsModule,
    MatExpansionModule

    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
