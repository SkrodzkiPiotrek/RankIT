import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {ClubListComponent} from "./club-list/club-list.component";
import {ClubAddformComponent} from "./club-addform/club-addform.component";
import {BrowserModule} from "@angular/platform-browser";
import {AppRoutingModule} from "../app-routing.module";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {ClubService} from "./club.service";

import {ClubDeleteComponent} from './club-delete/club-delete.component';
import { ContactComponent } from './contact/contact.component';
import { CompetitonScheduleComponent } from './competiton-schedule/competiton-schedule.component';
import { StadiumListComponent } from './stadium-list/stadium-list.component';


@NgModule({
  declarations: [
    AppComponent,
    ClubListComponent,
    ClubAddformComponent,
    ClubDeleteComponent,
    ContactComponent,
    CompetitonScheduleComponent,
    StadiumListComponent,

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
export class AppModule {
}
