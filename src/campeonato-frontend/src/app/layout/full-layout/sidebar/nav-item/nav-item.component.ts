import {Component, EventEmitter, HostBinding, Input, OnChanges, Output} from '@angular/core';
import {NavItem} from "./nav-item.type";
import {Router} from "@angular/router";
import {TablerIconsModule} from "angular-tabler-icons";
import {CommonModule} from "@angular/common";
import {MatMenuModule} from "@angular/material/menu";
import {MatListModule} from "@angular/material/list";
import {MatIconModule} from "@angular/material/icon";

@Component({
  selector: 'app-nav-item',
  standalone: true,
  imports: [TablerIconsModule, CommonModule, MatMenuModule, MatListModule, MatIconModule],
  templateUrl: './nav-item.component.html',
  styles: ``
})
export class NavItemComponent implements OnChanges {
  @Input() item: NavItem | any;
  @Input() depth: any;

  @Output() toggleMobileLink: any = new EventEmitter<void>();
  @Output() notify: EventEmitter<boolean> = new EventEmitter<boolean>();

  expanded: any = false;
  disabled: any = false;
  twoLines: any = false;

  @HostBinding('attr.aria-expanded') ariaExpanded = this.expanded;

  constructor(public router: Router) {
    if (this.depth === undefined) {
      this.depth = 0;
    }
  }

  ngOnChanges() {
    /*this.navService.currentUrl.subscribe((url: string) => {
      if (this.item.route && url) {
        // console.log(`Checking '/${this.item.route}' against '${url}'`);
        this.expanded = url.indexOf(`/${this.item.route}`) === 0;
        this.ariaExpanded = this.expanded;
        //console.log(`${this.item.route} is expanded: ${this.expanded}`);
      }
    });*/
  }

  onItemSelected(item: NavItem) {
    if (!item.children || !item.children.length) {
      this.router.navigate([item.route]);
    }
    if (item.children && item.children.length) {
      this.expanded = !this.expanded;
    }
    //scroll
    window.scroll({
      top: 0,
      left: 0,
      behavior: 'smooth',
    });
    if (!this.expanded) {
      if (window.innerWidth < 1024) {
        this.notify.emit();
      }
    }
  }

  onSubItemSelected(item: NavItem) {
    if (!item.children || !item.children.length) {
      if (this.expanded && window.innerWidth < 1024) {
        this.notify.emit();
      }
    }
  }
}
