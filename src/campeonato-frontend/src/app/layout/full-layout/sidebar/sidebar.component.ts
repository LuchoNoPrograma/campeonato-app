import {Component, OnInit} from '@angular/core';
import {CommonModule} from '@angular/common';

/*
import { NavService } from '../../../../services/nav.service';
import { NgScrollbarModule } from 'ngx-scrollbar';
import { TablerIconsModule } from 'angular-tabler-icons';
import { MaterialModule } from 'src/app/material.module';
*/
import {RouterModule} from '@angular/router';
import {MatMenuModule, MatMenuTrigger} from "@angular/material/menu";

import {MatIconModule} from "@angular/material/icon";
import {AppTablerIconsModule} from "../../../plugins/app-tabler-icons.module";

/*import { AppNavItemComponent } from './nav-item/nav-item.component';*/


@Component({
  selector: 'app-sidebar',
  standalone: true,
  imports: [
    RouterModule, CommonModule, MatMenuModule, AppTablerIconsModule, MatIconModule
  ],
  templateUrl: './sidebar.component.html',
})
export class SidebarComponent implements OnInit {

  ngOnInit(): void {
  }
}
