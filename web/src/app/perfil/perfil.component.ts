import { Component } from '@angular/core';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';
@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.scss']
})
export class PerfilComponent {
  constructor(private router: Router) {}

  actualizar():void{
    Swal.fire({
      text: 'perfil actualizado Exitosamente.',
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
