import {Component, EventEmitter, Input, Output} from '@angular/core';
import {RouterModule} from "@angular/router";
import {MatToolbar} from "@angular/material/toolbar";
import {AppTablerIconsModule} from "../../../plugins/app-tabler-icons.module";
import {MatButtonModule} from "@angular/material/button";
import {MatMenuModule} from "@angular/material/menu";
import {MatIconModule} from "@angular/material/icon";
import {NgScrollbarModule} from "ngx-scrollbar";

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [MatToolbar, AppTablerIconsModule, MatButtonModule, MatMenuModule, MatIconModule, RouterModule, NgScrollbarModule],
  templateUrl: './header.component.html',
  styles: ``
})
export class HeaderComponent {
  /*Atributo de entrada que viene desde el padre*/
  @Input() mostrarBotonEscritorio: boolean = true;

  @Output() cambiarNav: EventEmitter<void> = new EventEmitter<void>();
  @Output() cambiarNavMobile: EventEmitter<void> = new EventEmitter<void>();
}
