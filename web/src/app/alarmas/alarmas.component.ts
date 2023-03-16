import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../header/header.component';


@Component({
  selector: 'app-alarmas',
  templateUrl: './alarmas.component.html',
  styleUrls: ['./alarmas.component.scss']
})
export class AlarmasComponent  {
  panelOpenState = false;

  showButtons = true;

}
