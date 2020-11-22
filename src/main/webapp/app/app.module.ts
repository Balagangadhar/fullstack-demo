import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { FullstackDemoSharedModule } from 'app/shared/shared.module';
import { FullstackDemoCoreModule } from 'app/core/core.module';
import { FullstackDemoAppRoutingModule } from './app-routing.module';
import { FullstackDemoHomeModule } from './home/home.module';
import { FullstackDemoEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    FullstackDemoSharedModule,
    FullstackDemoCoreModule,
    FullstackDemoHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    FullstackDemoEntityModule,
    FullstackDemoAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent],
})
export class FullstackDemoAppModule {}
