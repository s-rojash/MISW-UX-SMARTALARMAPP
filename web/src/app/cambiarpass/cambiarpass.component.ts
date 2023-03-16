import { Component } from '@angular/core';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cambiarpass',
  templateUrl: './cambiarpass.component.html',
  styleUrls: ['./cambiarpass.component.scss']
})
export class CambiarpassComponent {

  constructor(private route: Router) {}



  actualizar(): void {
    Swal.fire({
      text: 'Contraseña Actualizada Exitosamente.',
      icon: 'success',
      confirmButtonText: 'Aceptar',
      customClass: {
        confirmButton: 'ok-button-class'
      }
    }).then(() => {
      this.route.navigateByUrl('/login');
    });
  }
}

