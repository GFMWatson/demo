import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { MaterialModule } from '@angular/material';//deprecated, now import each individual module
//import { MdSidenavModule, MdGridListModule, MdButtonModule, MdCardModule, MdMenuModule, MdToolbarModule, MdIconModule } from '@angular/material';

import 'hammerjs';

import { AppComponent } from './app.component';
import { SettingsDialog } from "./components/settings-dialog/settings-dialog";
import { DogService } from "./services/dog.service";


@NgModule({
  declarations: [
    AppComponent,
    SettingsDialog//otherwise it is not part of a module and can not go in entryComponents
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    BrowserAnimationsModule,
    MaterialModule
    // MdSidenavModule,
    // MdGridListModule,
    // MdButtonModule, 
    // MdCardModule, 
    // MdMenuModule, 
    // MdToolbarModule, 
    // MdIconModule 
  ],
  entryComponents: [//even though angular does not encounter this during bootstrap, compile it anyhow
AppComponent,
SettingsDialog
  ],
  
  providers: [DogService],
  bootstrap: [AppComponent]
})
export class AppModule { }
