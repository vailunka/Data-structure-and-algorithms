# TIRA-2022

Tämä repository (koodiarkisto tai tietovarasto), lyhyesti "repo", sisältää harjoitus- ja harjoitustyömateriaalin kurssille Tietorakenteet ja algoritmit (lyhyesti TIRA).

Sinä opiskelijana luot tästä repositorystä oman kopiosi eli forkin GitLabissä oman tunnuksesi alle. Sen jälkeen kloonaat (clone) tämän forkin omalle tietokoneellesi ja teet kurssin harjoitukset ja harjoitustyöt omalla tietokoneellasi. Sitä mukaa kun saat tehtäviä tehtyä, toimitat tekemisesi forkin kautta opettajien arvioitavaksi. 

Miten tämä kaikki tapahtuu, kerrotaan tässä ja muissa repon ohjetiedostoissa. Lisäksi kurssimateriaali sisältää useita demovideoita joiden kautta näet miten tämä tehdään. Ensimmäinen (ei arvosteltava) tehtävä kurssilla, `00-init` on testi siitä että kurssin työkalut ja forkkaamasi repository toimivat kuten pitää. 

Kaikki kurssin tehtävät ovat yksilösuorituksia, joten ryhmätyötä tässä kurssilla ei tehdä.

**TÄRKEÄ huomautus**: harjoituksissa ja harjoitustöissä **ei saa käyttää** Javan Collection (tietosäiliö) luokkia eikä niihin liittyviä algoritmeja (esimerkiksi `Collections`, `Arrays`, `Set`, `ArrayList`, `LinkedList`, `Stack`, `Vector`, `Queue`, mikään `Map` -toteutus, `Arrays.sort`, `Collections.sort`. jne.) ellei *erityisesti* sanota että se on sallittua jossain *tietyssä* harjoituksessa tai harjoitustyössä. , jne. 

On **sallittua** käyttää `String` -luokkaa ja kaikkia primitiivisiä (alkeis-)tietotyyppejä kuten int, long, short, double, float, char, näiden luokkaversiot (`Integer`, `Double`, jne.) ja "tavalliset" taulukot (esim. `String [] arrayOfStrings`). Niissä tehtävissä joissa pitää toteuttaa **hajautusfunktio** (tiivistefunktio, hash), **ei saa käyttää** Javan luokkien valmista `hashCode()` -metodia (esim. `String.hashCode()`), ellei taas erikseen toisin mainita, vaan tiivistefunktiot toteutetaan *itse*. Omia apuluokkia ja -algoritmeja on luonnollisesti hyväkin tehdä.


## Työkalut

Kurssilla tarvittavien työkalut ja niiden asennusohjeet on kerrottu [TOOLS.md](TOOLS.md) ohjeessa. 

**Asenna työkalut ensin** ja jatka sitten ohjeiden lukemista eteenpäin. Katso myös Moodlesta löytyvät demovideot aiheesta.


## Miten pystytän työtilani

Ohjeessa [SETUP.md](SETUP.md) kerrotaan miten voit forkata ja kloonata kurssin alkuperäisen repon omaa työskentelyäasi varten. Tämän tehtyäsi työskentelet omalla koneellasi *paikallisen* (local) reposi kanssa, ja kun olet saanut tehtävää eteenpäin, työntää työsi omaan etärepositoryysi.

Käytät git:iä kurssilla siihen että:

1. lisäät uusia kooditiedostoja ja muutoksia olemassa olevaan koodiin omalla koneella olevaan paikalliseen git-repositoryysi,
1. työnnät (push) paikallisessa repossa olevaa koodia omaan etärepositooryysi (GitLab),
1. josta opettajat voivat tarkastella edistymisetäsi, auttaa sinua ongelmien kanssa ja lopuksi hakea koodisi testattavaksi ja arvioitavaksi arvosanan antamista varten.

Seuraa siis ohjeita [SETUP.md](SETUP.md) -tiedostossa. Tämä pitää tehdä *vain kerran* kurssin alkaessa.


## Ajoitus ja määräajat

Taulukko alla kuvaa kurssin toteutuksen aikataulun syksyllä 2022. 

> Huomaa että jos se sinulle on mahdollista, voit edetä **nopeammin** kuin kurssin aikataulu esittää.

Jokainen alihakemistossaan oleva harjoitus sisältää oman `README.md` ohjetiedostonsa jossa on ohjeita kyseisen harjoituksen tai harjoitustyön toteuttamiseksi. Kun etenet harjoitusten kanssa, lue nämä ohjeet huolellisesti ennen kuin aloitat työskentelyn.

Kurssin deadline:n tullessa sekä kurssin päättyessä, kurssin opettajat kloonaavat skripteillään repositorynne automaattista testausta varten. Noudata kurssin määräaikoja; tarkistamme lataamamme version ja annamme palautteen ja arvosanan sen perusteella.


### Luennot

Kurssin **liveluennot** ovat lähinnä opiskelun tueksi ja demojen läpikäyntejä varten. Näiden aikataulutus löytyy Moodlen kalenterista. Varsinaiset luennot ovat katsottavissa videotallenteina.

Voit katsoa luennot videotallenteina omaan tahtiisi. Huomaa kuitenkin että kuhunkin harjoitukseen liittyvät luennot on syytä katsoa *ennen* kuin aloitat kyseisen harjoituksen tekemisen. Luennot antavat taustaa, esimerkkejä ja käsitteitä joita tarvitset harjoitusten tekemisessä. Tavallisin syy tehdä turhaa työtä ja/tai menettää pisteitä harjoitustehtävistä on se, ettei ole oikealla tavalla sovellettu luennoilla esitettyjä asioita harjoitustehtävässä. Sama pätee harjoitustöihin.


### Harjoitukset 

**Harjoitusten** aikataulutus on suunniteltu niin että *aloitat* harjoituksen alla mainitulla viikolla. Harjoituksen tekemiseen voi mennä muiden kiireidesi tai osaamisesi myötä viikko tai kaksi. Huomaa harjoitusten ajoitus ja määräajat, palauta työsi ajoissa. Älä jätä hommia viime tippaan, se on yleinen resepti lisästressille ja pisteiden menetykselle. Aloita töiden tekeminen ja viimeistele työsi mieluummin etupainoitteisesti.

Hyödynnä harjoituksia ja muita tukimuotoja **ajoissa**.

> Vihje: Voit pysyä kärryillä mitä koodissa on vielä tekemättä, poistamalla jokaisen `TODO` kommentin koodista kun olet saanut kyseisen kohdan tehtyä. Kun et löydä enää IDEn hakutyökalulla `TODO` kommentteja koodista, ja testit menevät läpi, olet tehnyt kaikki tehtävät. Huomaa kuitenkin että koodisi ei välttämättä vielä ole täydellistä eivätkä testit välttämättä huomaa kaikkia koodissa olevia ongelmia.

**Aikataulu ja deadlinet** selviävät tästä taulukosta:

| Viikko|  Aihe ja luentovideo | Harjoitustehtävän aloitus           | Huomioitavaa             |
|-------|----------------------|-------------------------------------|--------------------------|
|  44   | 00 Kurssin esittely  | [00-init](00-init)                  | Ei arvosteltava tehtävä  |
|       | 01 Aiheen esittely   | [01-arrays](01-arrays)              | Deadline 1:een!          |
|       | 02 Aikakompleksisuus | [02-mode](02-mode)                  | Deadline 1:een!          |
|  45   | 03 Analyysi          | [03-draw](03-draw)                  | Deadline 1:een!          |
|       | 03 Analyysi          |                                     |                          |
|       | 04-1 Pino            | [04-1-stack](04-1-stack)            | Deadline 1:een!          |
|       | 04-2/3 Jono, lista   |                                     |                          |
|  46   | 05 Järjestäminen     | [04-2-queue](04-2-queue)            | Deadline 2:een!          |
|       | 05 Järjestäminen     | [04-3-linkedlist](04-3-linkedlist)  | Deadline 2:een!          |
|       | 06 Hajautustaulut    |                                     |                          |
|       | 06 Hajautustaulut    |                                     |                          |
|  47   | 07 Binäärinen hakupuu| [05-binsearch](05-binsearch)        | Deadline 2:een!          |
|       | 07 Binäärinen hakupuu| [05-invoices](05-invoices)          | Deadline 3:een!          |
|       | 08 Verkot osa 1      |                                     |                          |
|       | 08 Verkot osa 1      |                                     | **1. deadline 27.11.**   |
|  48   | 08 Verkot osa 2      | [67-phonebook](67-phonebook)        | Deadline 3:een!          |
|       | 08 Verkot osa 2      |                                     |                          |
|       | 09 Suunnittelu,      |                                     |                          |
|       |    Dynaaminen...     |                                     |                          |
|  49   |                      |                                     | **2. deadline 11.12.**   |
|  50   | Tentti               |                                     |                          |
|  51   |                      |                                     |                          |
|  52   |                      |                                     |                          |
|1/2022 |                      |                                     |                          |
|2/2022 |                      |                                     | **3. deadline 15.01.**   |

Deadline on aina kyseisenä päivänä kello 23:59:59 EET.

## Arvostelu

Kurssi arvostellaan seuraavin periaattein:

1. Harjoitus `00-init` ei ole arvosteltava eikä siitä saa pisteitä. Tehtävän tarkoitus on testata että työkalut toimivat ja että perusohjelmointitaidot edeltäviltä kursseilta ovat tarpeellisella tasolla.
1. Opettajat tarkistavat onko tehtävät tehty hyväksyttävälle tasolle **deadlineen** mennessä. Jos näin ei ole, opiskelijalla on viikko aikaa korjata tilanne. Mikäli viikonkaan jälkeen tehtävä tai tehtävät ei(vät) ole hyväksyttävässä kunnossa, kyseisen deadlinen pisteistä **vähennetään 3 pistettä**. Näitä voi halutessaan kompensoida tekemällä valinnaisia tehtäviä. Mikäli pisteet eivät riitä kurssin läpäisyyn, valinnaisia tehtäviä on tehtävä sen verran että pisteet riittävät läpipääsyyn.
1. Kaikki varsinaiset harjoitukset on suoritettava hyväksytysti (1 pistettä), erinomaisesta suorituksesta saa 3 pistettä, poikkeukset tähän alla. 
1. Tehtävä `67-phonebook` on arvoltaan 5...10 pistettä.
1. Valinnainen harjoitus `xx-braille` on arvoltaan 5 pistettä.
1. Myös Books and Words -tehtävä on valinnainen, ja arvoltaan 5...10 pistettä.
1. Tentistä pitää saada vähintään 10 pistettä (max 20 pistettä).
1. Koodin laatu vaikuttaa arvosteluun. Katso lista alla.
1. Se että tehtävä läpäisee testit, ei vielä tarkoita hyväksyttyä tai erinomaista suoritusta (testit eivät voi huomata kaikkea).
1. Books and Words -työssä(kään) ei saa käyttää Javan tietosäiliöluokkia tai algoritmeja. Omia tietosäiliöitä ja algoritmeja jotka on tehty edeltävissä harjoituksissa *saa* ja niitä *oletetaan* käytettävän hyödyksi. Braille -tehtävässä taas *ei pidä* käyttää hyväksi edeltävissä harjoituksessa tehtyjä tietorakenteita. Lisätietoja näistä opettajilta.

Huomaa että harjoituksissa ja valinnaisessa harjoitustyössä *ei riitä* että toteutuksesi toimii (on toiminnallisesti oikeellinen). Harjoitustöiden täytyy toteuttaa *aikakompleksisuuden* suhteen *tehokas* tapa käsitellä *suuria* tietomääriä. Harjoitustyö joka toimii, voi siis olla hylätty, jos se ei toimi tarpeeksi nopeasti suurilla tietomäärillä. Tästä lisää kurssin luennoilla ja harjoitustöiden ohjeissa.

Huomaa myös että tässä harjoitellaan *yleiskäyttöisten* tietorakenteiden ja algoritmien toteuttamista, muidenkin ohjelmoijien käyttöön. Koodin ei siis pidä tehdä mitään muuta kuin se mitä tietorakenteen tai algoritmin kuuluu tehdä. Esimerkkejä siitä mitä lopullisen palautuksen koodissa *ei pitäisi* olla:

* Tietorakenneluokassa on `main()` -metodi omia kokeiluja varten. Poista tämä ja tee oma luokka (`.java` -tiedosto) omia testejä varten sinne missä tietorakenneluokkasikin on (*ei* testikoodihakemistoon).
* Koodissa on varoituksia aiheuttavia kohtia kun sitä käännetään. Korjaa koodi varoitukset poistaen.
* Poista opettajan koodiin laittamat TODO -kommentit kun koodi on toteutettu.
* Koodissa on kommentoitua koodia. Poista nämä kun niitä ei kerran tarvita. Poikkeuksena koodi joka on osa kommentteja, tai se että haluat jättää koodiin vaihtoehtoisen toteutuksen tai yritelmän jonka haluat jättää selityksen kera koodiin.
* Koodin joukossa on käyttämättömiä luokkia, metodeja, muuttujia, parametreja tai vakioita. Poista nämä.
* Koodi sisältää testikoodia ("kokeilempa miten tämä toimisi"), joka ei ole osa lopullisen tietorakenteen tai algoritmin toteutusta. Poista nämä.
* Tietorakenne tai algoritmi tulostaa konsoliin (System.out.println tms., jos ei *erikseen* sanota että näin tulee tehdä). *I/O on hidasta*, ja hidastaa koodisi suoritusta. Tällä on merkitystä varsinkin silloin kun testit mittaavat algoritmisi suoritusaikaa! Poista tulostukset jos erikseen tehtävässä niitä ei pyydetä tekemään.
* Tietorakenne tai algoritmi käyttää muistia enemmän kuin mitä on välttämättä tarpeen sen toteuttamiseksi. Pääsääntö on toteuttaa algoritmit "in place", esimerkiksi lajittelu (Quicksort, Heap sort). Tosin osa algoritmeista käyttää lisämuistia *suunnitellusti*, kuten Merge sort - tällöin lisämuistin käyttö on tietysti sallittua.
* Koodi on epäsiistiä, sisennykset pielessä, nimeämistyyli ei noudata Javan nimeämistyyliä tai muuttujien ja metodien nimet ovat käsittämättömiä tai haittaavat koodin ymmärtämistä. Käytä IDEn koodin formatointityökalua (VS Code: hiiren oikea näppäin koodieditorin alueella > Format Document). Luokkien nimet alkavat isoilla kirjaimilla (`FastHashTable`), metodien, muuttujien ja parametrien pienillä noudattaen `smallCamelCase` -nimeämistyyliä, vakiot nimetään `ISOILLA_KIRJAIMILLA_SNAKE_CASE`.

Yllämainitut asiat eivät tarkoita hylättyä tehtävää, mutta ne voivat laskea pistemäärää.

| Kurssisuorite   | Minimipisteet     | Maksimipisteet       |
|-----------------|------------------:|---------------------:|
| Harjoitukset (8)| 8 * 1 == 8 p      | 8 * 3 = 24 p         |
| 67-phonebook    |          5 p      | 10 p                 |
| Tentti          | 10 p              | 20 p                 |
| **Yhteensä**    | **23 p**          | **54 p**             |
| **Valinnaiset** |                   |                      |
| $ xx-braille    |                   | 5 p                  |
| $ Books&Words   |                   | 10 p                 |

Mahdolliset desimaalit (esim. Moodlen tenttipisteet) pyöristetään ylöspäin seuraavaan kokonaislukuun ennen arvostelun tekemistä.

Arvosana määräytyy pisteistä seuraavan taulukon mukaisesti.

| Pisteet | < 23  | 23-29 | 30-37 | 38-45 | 46-51 | >= 52  |
|---------|-------|-------|-------|-------|-------|--------|
| Arvosana| Hyl.  |   1   |   2   |   3   |   4   |   5    |

Jos haluaa varmistaa läpipääsyn ja/tai hyvän arvosanan, kannattaa tehdä tehtävät hyvin ja panostaa valinnaisiinkin tehtäviin.

## Toisten työn kopiointi ja plagiointi

Kaikki koodi ja muut suoritukset tällä kurssilla on oltava sinun itsesi kirjoitettamaa koodia ja tekstiä. Koodin kopiointi toisilta ja internetistä on **kiellettyä**. Voitte työskennellä yhdessä opiskelijakaverin kanssa ja keskustella toistenne kanssa toteutuksista, mutta jokainen kirjoittaa **joka ikisen rivin koodistaan** ihan itse. Jokainen vastaa itse omasta koodistaan ja sen toiminnasta tai toimimattomuudesta. Muista että se kaverin ratkaisu voi olla väärä tai huono, jolloin sen käyttäminen huonontaa myös omaa arvosanaasi.

Voit käyttää kurssin kaikkea materiaalia (luentomateriaali, pseudokoodit, demot, esimerkit) inspiraationa omalle toteutuksellesi. Voit tietysti myös etsiä internetistä tietoa ja esimerkkejä, mutta muista että itse koodaat kaiken mitä harjoituksiin ja harjoitustyöhösi laitat. Huomaa myös että kun otat mallia muualta, voit myös ottaa huonoa mallia huonoista esimerkeistä. Varmista siis että toteutuksesi vastaa sitä mitä kurssilla on opetettu.

Jos hyödynnät jotain tiettyä esimerkkiä koodissasi jonka itse kirjoitit, on hyvä käytäntö (jota tällä kurssilla on syytä noudattaa) viitata käyttämääsi lähteeseen laittamalla koodiin kommentti jossa linkki käyttämääsi lähteeseen. Näin jos opettaja huomaa toteutuksessasi puutteita tai ongelmia, voimme tarkistaa lähteesi ja katsoa onko toteutuksesi lähteesi mukainen, oletko tulkinnut lähdettä väärin vai onko kenties käyttämäsi lähde väärässä tai huono, tai että se ei sovellu tilanteeseen jossa sitä käytit.

Jos on syytä epäillä kopiointia tai plagiointia, opettajat noudattavat [Oulun yliopiston käytäntöjä (pdf)](https://www.oulu.fi/external/Ohje-vilppitapausten-ehkaisemiseen-ja-kasittelemiseen-Oulun-yliopistossa-2018.pdf) vilppien käsittelyssä. Minimirankaisu vilppitapausten käsittelyssä on kurssin suorituksen välitön keskeyttäminen hylätyllä arvosanalla. Jos tapaus on vakavampi, sen käsittely viedään tiedekunnan dekaanin päätettäväksi.

## Tietoja

* Kurssimateriaalia Tietorakenteet ja algoritmit -kurssille | Data structures and algorithms 2021-2022.
* Tietojenkäsittelytieteet, Tieto- ja sähkötekniikan tiedekunta, Oulun yliopisto.
* (c) Antti Juustila 2021-2022, INTERACT Research Group.
