import {RouterModule, Routes} from "@angular/router";
import {ClubListComponent} from "./app/club-list/club-list.component";
import {CLubFormComponent} from "./app/club-form/club-form.component";
import {NgModule} from "@angular/core";

const routes: Routes = [
  { path: 'clubs', component: ClubListComponent },
  { path: 'addclub', component: CLubFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
