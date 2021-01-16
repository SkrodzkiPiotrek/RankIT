import { Component, OnInit } from '@angular/core';
import {Club} from "../club";
import {ActivatedRoute, Router} from "@angular/router";
import {ClubService} from "../club.service";

@Component({
  selector: 'app-club-form',
  templateUrl: './club-form.component.html',
  styleUrls: ['./club-form.component.css']
})
export class CLubFormComponent {

  club: Club;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private clubService: ClubService) {
    this.club = new Club();
  }

  onSubmit() {
    this.clubService.save(this.club).subscribe(result => this.gotoClubList());
  }

  gotoClubList() {
    this.router.navigate(['/clubs']);
  }
}

