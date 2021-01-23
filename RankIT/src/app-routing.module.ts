import {RouterModule, Routes} from "@angular/router";
import {ClubListComponent} from "./app/club-list/club-list.component";
import {ClubAddformComponent} from "./app/club-addform/club-addform.component";
import {NgModule} from "@angular/core";

import {ContactComponent} from "./app/contact/contact.component";
import {CompetitonScheduleComponent} from "./app/competiton-schedule/competiton-schedule.component";
import {StadiumListComponent} from "./app/stadium-list/stadium-list.component";
import {MainComponent} from "./app/main/main.component";

const routes: Routes = [
  { path: 'clubs', component: ClubListComponent },
  { path: 'addclub', component: ClubAddformComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'competitions', component: CompetitonScheduleComponent },
  { path: 'stadiums', component: StadiumListComponent },
  { path: 'main', component: MainComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
