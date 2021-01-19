import {RouterModule, Routes} from "@angular/router";
import {ClubListComponent} from "./app/club-list/club-list.component";
import {ClubAddformComponent} from "./app/club-addform/club-addform.component";
import {NgModule} from "@angular/core";

const routes: Routes = [
  { path: 'clubs', component: ClubListComponent },
  { path: 'addclub', component: ClubAddformComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
