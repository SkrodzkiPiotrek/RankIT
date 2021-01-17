import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {ClubListComponent} from "./club-list/club-list.component";
import {CLubFormComponent} from "./club-form/club-form.component";
import {BrowserModule} from "@angular/platform-browser";
import {AppRoutingModule} from "../app-routing.module";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {ClubService} from "./club.service";
import { AdminSiteComponent } from './admin-site/admin-site.component';


@NgModule({
  declarations: [
    AppComponent,
    ClubListComponent,
    CLubFormComponent,
    AdminSiteComponent,
    AdminSiteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ClubService],
  bootstrap: [AppComponent]
})
export class AppModule { }
