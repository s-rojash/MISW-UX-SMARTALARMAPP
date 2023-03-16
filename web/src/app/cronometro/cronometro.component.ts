import { Component } from '@angular/core';

@Component({
  selector: 'app-cronometro',
  templateUrl: './cronometro.component.html',
  styleUrls: ['./cronometro.component.scss']
})
export class CronometroComponent {
  tiempo = 0;
  corriendo = false;
  intervalo: any;

  iniciarCronometro() {
    this.corriendo = true;
    this.intervalo = setInterval(() => {
      this.tiempo++;
    }, 1000);
  }

  detenerCronometro() {
    clearInterval(this.intervalo);
    this.corriendo = false;
    this.tiempo = 0;
  }
}
