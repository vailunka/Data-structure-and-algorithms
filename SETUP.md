# TIRA-2022 Käyttöönotto

Tässä ohjeessa neuvotaan miten:

1. luot itsellesi tilin GitLab -palveluun ja
1. miten forkkaat ja kloonaat kurssin projektin omaan yksityiseen GitLab -repositoryysi ja saat sen omalle koneellesi työskentelyä varten.

Ohjeessa oletetaan että olet jo asentanut [kurssin työkalut](TOOLS.md) koneellesi.

Työkalujen **asennus- ja käyttöönottodemon** näet Moodlessa olevan videolinkin kautta.

## GitLab 

Tarvitset **tilin** [GitLabiin](https://gitlab.com). Kaikki harjoitus- ja harjoitustyömateriaali toimitetaan tätä kautta ja palautat myös omat suorituksesi opettajille arvioitavaksi tätä kautta. 

Ensimmäisenä askeleena *forkkaa* opettajien osoittama projekti kuten demovideossa näytetään ja alla olevassa askeleittain etenevässä ohjeessa neuvotaan.

Ohjeita git:n käytöstä löydät demovideoiden lisäksi muistakin kurssin ohjeista. Yksinkertainen lista git:n komennoista on mukana tässä repossa ohjeessa [GIT-CHEAT-SHEET.md](GIT-CHEAT-SHEET.md).

Kurssilla neuvotaan myös miten ilmoitat opettajille forkkaamasi repositoryn URL:n. Toimita reposi osoite ohjeistetulla tavalla opettajille. Ilman tätä URLia opettajat eivät tiedä mistä työsi löytyy eivätkä voi hakea työtäsi arviointia varten.

## Miten pystytät työympäristösi

Ohjeissa oletetaan että luet tätä ohjetta opettajien repositoryn webbisivulta.

Ensimmäinen askel on forkata kurssin repo GitLabissa ja kloonata se omalle koneellesi. Tämä on tehtävä *vain kerran*, olettaen että työskentelet vain yhdellä tietokoneella.

> Jos teet töitä useammalla koneella, kysy lisäohjeita opettajilta! Varsinkin jos sinulla ei ole kokemusta git:n käytöstä useammalla koneella.

Kun olet tehnyt alla olevat askeleet, tietokoneellasi pitäisi olla klooni omassa etärepossa olevasta forkistasi. Paljon uusia sanoja, ehkä, mutta opit tämän nopeasti.

1. Luo itsellesi omalla koneellasi **ssh -avain**  jonka viet GitLabiin demovideolla näkyviä ohjeita noudattaen.
1. Kun olet kirjautuneena GitLab -tilillesi, mene kurssin opettajien repoon. Osoitteen löydät kurssin Moodlesta. Tosin jos luet jo tätä ohjetta, olet varmasti oikeassa paikassa! :) 
1. **Forkkaa** projekti videon ohjeita noudattaen, jolloin saat oman kopiosi tästä repositorystä oman GitLab -tunnuksesi alle.
1. Mene projektisi asetuksiin ja **tee projektistasi privaatti (private)**.
1. **Lisää kurssin opettajat** oman repositorysi jäseniksi (member) oikeustasona **Developer** access level. Opettajien pitää päästä repositoryysi kun ohjaamme työtäsi, autamme ongelmissasi ja tarkastamme ja arvostelemme suorituksesi. Kenelläkään muulla ei pitäisi olla pääsyä repositoryysi kuin sinulla ja opettajilla.
1. Omalla tietokoneellasi, **avaa komentorivi-ikkuna** (terminal window).
1. **Mene hakemistoon** koneellasi jonne haluat **paikallisen kloonin** omasta etärepositorystäsi. Valitse hakemistopolku jossa **ei ole välilyöntejä tai mitään erikoismerkkejä kuten äöü&*! ja niin edelleen**. Useat ohjelmistokehitystyökalut sekoavat jos ohjelmointiin liittyviä tiedostoja on paikoissa joissa on näitä erikoismerkkejä. Kaikki mitä kurssilla teet, sijoittuu tähän hakemistoon. Älä vahingossakaan sotke tätä hakemistoa poistamalla tai siirtämällä sieltä/sinne mitään ylimääräistä.
1. **Kloonaa** oma privaatti forkkisi GitLabistä tähän työhakemistoon käyttämällä ssh -URLia omaan GitLab:n etärepositoryysi: `git clone <ssh-url-to-your-remote-private-forked-repository>`. Jos teit ssh-avaimen siten että se on suojattu salasanalla, tässä vaiheessa sinulta kysytään tätä salasanaa. Huomaa että tämä ei ole salasana GitLabiin, tietokoneeseesi tai muualle, se on salasana vain tuon ssh -avaimen käyttöön. Laita tuohon väkästen väliin vain se GitLab:sta saamasi ssh -muotoinen URL ilman noita väkäsiä "< >".
1. Tämän jälkeen sinulla pitäisi olla tietokoneellasi **paikallinen repo** (local repository), kopio GitLab:ssa olevasta privaatista forkistasi. Harjoitusten edetessä käytät git:iä päivittämään etärepostoryä GitLabissa joten se pysyy ajan tasalla tekemisistäsi. Samoin opettajat.

Pääteikkunassa, listaa mitä tiedostoja koneellesi latautui (`dir` komento Windowsissa, `ls` Unixeissa/Linuxeissa/macOSssa). Selaile hakemistoja ja tiedostoja ja tutki mitä koneellesi sait.

> Jälleen kerran: *varo* ettet vahingossa poista tai siirrä mitään paikasta toiseen. Jos hävität jotain jota et ole vielä vienyt etärepoosi, eikä paikallisessakaan repossa ole siitä versiota, olet menettänyt työsi. Älä missään nimessä hävitä kloonisi `.git` -alihakemistoa koneeltasi, se sisältää kaikki paikalliset versiot ja tiedot etärepositorystä. Jos täältä jotain häviää, joudut luomaan yhteyden etärepoon käsin joka voi olla vaikeaa.

Nyt koneellasi on siis kopio kaikesta mitä kurssilla tehdään. Noudata ohjeita kuhunkin harjoitukseen liittyen kun etenet harjoituksesta toiseen. Kysy tarvittaessa lisäohjeita opettajilta.

## Tietoja

* Kurssimateriaalia Tietorakenteet ja algoritmit -kurssille | Data structures and algorithms 2021-2022.
* Tietojenkäsittelytieteet, Tieto- ja sähkötekniikan tiedekunta, Oulun yliopisto.
* (c) Antti Juustila 2021-2022, INTERACT Research Group.
