import { Component } from '@angular/core';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.scss']
})

export class RegistroComponent  {
  constructor(private router: Router) {}

  registrar(): void {
    Swal.fire({
      text: 'Usuario creado Exitosamente.',
      icon: 'success',
      confirmButtonText: 'Aceptar',
      customClass: {
        confirmButton: 'ok-button-class'
      }
    }).then(() => {
      this.router.navigateByUrl('/login');
    });
  }
}
