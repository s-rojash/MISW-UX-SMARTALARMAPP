import { Component, Input } from '@angular/core';
import {ThemePalette} from '@angular/material/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {
  isLoggedIn = true;
  mostrartabs = true;
  @Input() showButtons = true;
  links = ['Alarmas', 'Recordatorio', 'Cronometro', 'Perfil'];
  activeLink = this.links[0];

  constructor(private router: Router) { }

  ngOnInit():void{
    this.router.events.subscribe((val:any)=>{
      if(val.url){
        if(['alarmas','cronometro','perfil','recordatorio'].some(substring => val.url.includes(substring))) {
          this.isLoggedIn = false;
          this.mostrartabs = true;
        } else {
          this.isLoggedIn = true;
          this.mostrartabs = false;
        }
      }
    })
  }

}




