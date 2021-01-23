import { Component, OnInit } from '@angular/core';
import {Club} from "../club";
import {ClubService} from "../club.service";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  clubs: Club[];
  constructor(private clubService: ClubService) { }

  ngOnInit() {
    this.clubService.findAll().subscribe(data => {
      this.clubs = data;
    });
  }

}
