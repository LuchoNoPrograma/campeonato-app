import {Component, ViewChild, ViewEncapsulation} from '@angular/core';
import {RouterModule} from "@angular/router";
import {SidebarComponent} from "./sidebar/sidebar.component";
import {MatSidenav, MatSidenavModule} from "@angular/material/sidenav";
import {MatListModule, MatNavList} from "@angular/material/list";
import {navItems} from "./sidebar/sidebar-enlaces";
import {NavItemComponent} from "./sidebar/nav-item/nav-item.component";
import {NgScrollbarModule} from "ngx-scrollbar";
import {HeaderComponent} from "./header/header.component";

@Component({
  selector: 'app-full-layout',
  standalone: true,
  imports: [
    SidebarComponent,
    RouterModule,
    MatSidenavModule,
    MatListModule,
    NavItemComponent,
    NgScrollbarModule,
    HeaderComponent
  ],
  templateUrl: './full-layout.component.html',
  styles: ``,
  encapsulation: ViewEncapsulation.None,
})
export class FullLayoutComponent {
  @ViewChild('sidenav')
  public sidenav: MatSidenav | undefined;

  protected readonly navItems = navItems;

  private pantallaMobile: boolean = false;

  constructor() {
    console.log("Iniciando FullLayoutComponent");
  }

  esPantallaMobile() {
    return this.pantallaMobile;
  }

  cambiarNav() {
    this.sidenav?.toggle();
  }
}
