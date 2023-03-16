import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlarmasComponent } from './alarmas/alarmas.component';
import { CambiarpassComponent } from './cambiarpass/cambiarpass.component';
import { CronometroComponent } from './cronometro/cronometro.component';
import { LoginComponent } from './login/login.component';
import { PerfilComponent } from './perfil/perfil.component';
import { RecordatorioComponent } from './recordatorio/recordatorio.component';
import { RecuperapassComponent } from './recuperapass/recuperapass.component';
import { RegistroComponent } from './registro/registro.component';
import { SendcodesComponent } from './sendcodes/sendcodes.component';

const routes: Routes = [
  { path: 'alarmas', component: AlarmasComponent },
  { path: 'recordatorio', component: RecordatorioComponent },
  { path: 'cronometro', component: CronometroComponent },
  { path: 'perfil', component: PerfilComponent },
  { path: 'login', component: LoginComponent },
  { path: 'registro', component:RegistroComponent},
  { path: 'recuperapass', component:RecuperapassComponent},
  { path: 'sendcodes', component:SendcodesComponent},
  { path: 'cambiarpass', component:CambiarpassComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }



