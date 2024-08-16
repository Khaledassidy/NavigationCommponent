package com.example.navigationcommponent;

import android.app.Notification;
import android.os.Bundle;
import android.service.credentials.Action;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;



/*
navigation commponent:no3 mn anwa3 l application le mnest3mel fehoun fragment

android jetpack:3ebara 3an library 2aw majmo3et librarys hayde librarys 3emloha l mose3det l android developer 3ala sho bada tse3edoun?
3ala afdal momeraset b ketebt code w kamen tawefo2 been versions l android l 2ademe w l jdede heda be25tesar ta3ref l android jetpack
ya3ne 3ebara 3an majmo3et maketeb 3mloha 3ala mose3det l android developer b ketebet code bshakl asra3 bshakl afdal w kamen 3ashen ye2daro ya3melo tawefo2 been l android version l ademe w l jdede

android jetpack bney2esem la 4 2asesm kel 2esm mn hay l 2a2sem bdem 2ela librarys :
foundation:Android Ktx,AppCompat,Car,Benchmark,muldidex,Security,test,Tv,wearOs by google
behavior:Camerax,Media & playback,notification,permission,preferences,sharing
UI:Animation & transitions,emoji,fragemnet,layout,platte,viewpager2,webview
Architecture:Viewmodel,Databinding,lifecycels,livedata,navigation,paging,room,workmanager

ne7na hala2 bhay jez2eye la7 ne5od sha8le mawjoude bel architetcture le heye naviagtion Commponent



Naviagtion Component:heye wa7de mn l librarys  le tenderej ta7s mosama l jetpack w ta7dedan mn l architetcture :

Naviagtion Component:
Navigation howe bsheer la tafa3olet le btesma7 lal users bel 2ente2al la ajze2 mo5talefe b de5el l app example 3ala application l phone ne7na 2olna naviagtion b sheer lal tafa3olt le btesma7 lal user bel 2ente2al la ajze2 mo5talefe bdel l application hala2 ana ka user fat7t application l calls fa nla7ez eno b2a3la l application l calss fe 3ande jez2 ma7tot 3lee logo star w jez2 ma7tot 3lee logo l history,w wa7de lal contacts wa7de lal call hala2 iza serna nkabes 3lyhoun ana ka user sort 3am ente2l la ajze2 mn l application w bkel seneye ana bjez2 mo5talef mn l application meen l mas2ol 3an heda she?
be25tesar howe navigation commponent heda howe ta3ref l mo5tasar

naviagtion commponent bdem 3 ajze2 assasye ya3ne naviagtion byetkawan mn 3 ajze2  :
1-Naviagtion Graph:bye7tewe 3ala sha8lten ra2ysyten 2aw 3onsouren asasyen houne destinations wl actions sho ya3ne destination w action abl ma n2ol sho houne nerja3 nwade7 ta3ref naviagtion lesh 3mlo naviagtion?
3mlo navigation la7ata ytem estebdel l activitys bel fragments ya3ne hala2 enta 3andak applications l phones bas tente2l mn l contacts lal logs lal history haw keloun shshet mn zamen kenet kel shshe 3ebara 3an activity kel screen 3ebra 3an activity hala2 ba3d ma 3mlo navigation commponent sar mn sahl estebdel haw l activity bel fragments
tyeb sho howe rabt been destinations w l fragemnts
Destinations:destination bel naviagtion components by2sdo fe 3ada l fragemnt le 7a test3mloun de5el l app ya3ne masln law 3andak app bye7tewe 3ala setting,home,login,regestration bye7tewe 3ala 5ams shshet kel sheshe 3ebara 3an destination destination bel 3arabe ya3ne l alwejha ya3ne ana lama eje 2ol ana wejhate ela lobnen  ya3ne bade rou7 3ala lobnen keef erbet heda l kalem bel android hala2 enta bas ykoun l application amemak w enta bel screen home badak tente2l la notifications wejhte la notifications la heek btakaro mostala7 destinations 3ala l fragment l2no enta lama tente2l mn home screen la notification screen  enta hala2 8ayart wejhtak  mn hay l manta2a la hay l mnta2a mn homescreen lal notification w kel destination b maslo fragment
Actions:navigation graph bye7tewe 3ala destinations w l actions l actions b 2e5tesar le 7a y2om berabt destinations ma3 ba3da enta lama tente2l mn l home screen lal notifications screen btente2l 3an tare2 action
2-Nav host:navhost 3ebara 3an 7ewye fadye hay l 7eweye l ferga bto3roud btem 3ard b2alba destinations l mawjoude b navigation graph ya3ne ne7na 2olna naviagtion graph bye7tewe 3ala aham 3anasro heye destinations hay destination sawe2 keen homescreen,notification screen,setting screen ween btem wad3o 2aw meen 7a y2om b 3ardo b 2aye ma7al le 7a yetwala heda l mawdo3 l navhost w navhost la7 ya3mel implementation la navhost l 2efterade le esmo navhostfragment law nta2lna la android studio la nshof sho howe navhostfragmnet howe l 7ewye l efteradeye be mojarad ma ta3mel navigation la7 ykoun elak navhost wl 7eweye l efteradeye elo  esma navhostfragemnt ya3ne iza ro7t hala2 3al xml w deft navigationcontainer ma7al ma bado yerkab navigation la7 ydefo bshakl efterade attribute esma name le bt7aded hay l attribute aye fragemnt bado yerkab houn fa 7ato bel name she esmo navhostfragemnt iza ro7t control w re7t 3leee la7 tla7ez eno 3ebara 3an class extends fragment w implement navhost ya3ne sar heda l class howe le 7a yetwala mawdo3 3ard heda distination bede5lo ya3ne sar heda l class howe l container taba3 l destination ya3ne howe le 7a ytem 3ard destination bede5lo
3-Nav Controller:nav controller 3ebara 3an object heda l object howe  le 7a ydeer 2aw yetwala edaret l ente2al been haw l wejhat ya3ne l fragment  ya3ne btente2l la scren home,notification screen,login ,sigup meen le 7a ya3mel controller 3ala hayde l ente2let bde5el l navigation howe l navcontroller


Plugin:
l7ata tebda2 be2ste5dem navigation commponenet  bde5el l android studio lezm deef plugin
1-navigation Fragmnet:implementation(libs.navigation.fragment.ktx.nav.version.z)
2-navigation ui:implementation(libs.navigation.ui.ktx.nav.version.z)



navigation editor bye7tewe 3ala 3 sha8let la7ta nwade7 haw l 3 sha8let ba3d ma deef l plugin bta3mel file bel resource esmo navigation w b2albo file xml :
kel navigation graph byetkawan mn 3 ajze2
1-Destinations Panel:bebyen eno sho 3andak me7tawa b2alab l navigation malsn 3andak fragemnt 1 ,fragemnt 2,fragemnt 3
2-Graph Editor:howe mawjoud bel nous bebyen 3andak l screen navigations le 3andak bya3tek vesulization 3ala l fragemnt keef marboten ba3d
3-Attribute:attribute la kel fragemnt


keef mndef navhostfragmnet 3an tare2 l xml:
howe 3ebara 3an 3onsour esmo Fragmnet Container View 3ando mawjmo3et 5asa2es:
id,name,width,height,defaultNavhost,navgraph
name:name b2e5tesar eno ana la7 erbet hayde l wejhat bel container l efterade ya3ne mojarad ma 2ol name="navhostfragmnet" ya3ne l 7ewye l efteradeye howe navhostfragemnt
defualtnavhost:bekoun true 2aw false iza keen true ya3ne 3am 2olo la nezam l anddroid eno navhost la7 y2om bel 2e3terad bas tekbous 3ala l back button ya3ne ta3mel back ama iza keen false ma 7a ye3tered bas ta3mel back button ta3mel back ya3ne heda l 2amr
navgraph:yemken bel application ta3ele ykoun aktr mn navgraph tyeb ana keef bade 7aded eno heda l fragemntcontainer view bade yeh yertebet ma3 navigation le esmo kaza 3an tare2 hay l attribute le esma navgraph eno heda l contianer marbout bheda l navigation graph ya3ne la7 ye3red hyade navigation graph ya3ne sar heda l contaniner byest5dem navigation graph le esmo nag_graph masln


hala2 2awl she ne7na mna3mel add lal plugin
ba3den 3ashen na3mel navigation mnest3mel file values bel resources esmo naviation la na3mel navigation resource
ba3den mna3mel conatinerfragemnt bel activity w mn7aded l attribute name,deffultnavhost,navgraph

hala2 keef bade 2a3mel add la destinations b2lab l nav graph:
momken ykoun l destination 3ebara 3an fragemnt 2aw activity metl ma 2olna ya3ne 3an majmo3et fragemnt mawjmo3et activity keef bade defoun bel navigation graph as destinations
iza nta2lna 3ala l nav_graph file
momekn b2alb l editor ekbous kabset click to add destination bya3tek majmo3et 5eyarat 2aw kabset l plus bya3tek naf l 5eyrat haw l 5eyarat 3ebara 3an l fragemnt w l activity le 3andak  le mawjoude 3andak fa bebyno 3andak w enta btkbous 3ala wa7de mnon hay tare2a la deef destinations mn 5elel l editor
hala2 enta mojarad ma deef destination sawe2 keen activity 2aw fragmnet 7a ykoun 3ando majmo3et 5asa2es:
1-Type:mn 5elel hay l attribute bt7aded no3 destination  sawe2 keen fragemnt 2aw activity ya3ne howe activity 2aw fragemnt
2-Label:la7 ytem ketbto faw2 l destination sawe2 keen activity 2aw fragemnt ya3ne ana bade home notification kaza btl2e label maktob bel editor fo2 kel screen label howe l esm l mawjoud fo2 fo2 kel destination l esm l detination howe kamen l esm le 7a yezhar la heda l fragemnt 2w l activity bel toolbar bas tsha8el toolbar
3-id:mn 5elel l id be2dar et3emal ma3o bas ente2l lal code bas ente2l lal activity 2aw fragemnt lezm kel destination ela id
3-Class|name:heda l class howe le 7a yerbet l design ma3o ya3ne enta 3mlt design b2lab l fragemnt w badak destination heda l fragemnt fa l class howe esm hayde l fragemnt 3ashn ybyen design 3andak b2lab destination le enta 3mlto bel fragemnt  ya3ne bekoun l context elo enta bt7ot b2albo l id taba3 l fragemnt 2aw l activity la hayde destination iza kabt 3lee bye5dok 3ala l fragemnt le enta 3emela


keef mn 5ale l screen m7adade howe l tblesh heye l home screen ya3ne 2awl ma nefta7 l ap tkoun heye l home screen:
da8t 3ala l destination 2aw right click w bta7ded statrt destination fa bas ta3mel hay l 7arake 7a ybyen 3ala l destination le 7atyta start destination ma7tot faw2a icon l home eno heye l home screen 2awl screen btbyen
2aw feek ta3mel mn 5elel l code b tag navigation tag esma start destination"" w bta3teha l id


Connect destination:
ya3ne la n2ool 7adadna l start destination loginscrren
bas yed58at 3ala button bel loginscreen b7awlo 3ala l homescreen
wmn l home screen lal detils screen  ya3ne keef terbout destination ba3da
fe she 3ana esmo actions b2lab l navigation graph:
l actions howe le 7a yetwala hayda l mawdo3 ya3ne 3meel action mn hay l fragemnt la hay l fragemnt mn hay destination la hay destination
bas ne7na lama kona n2ol bade ente2l mn activity A la activity B kont est5dem intent hala2 houn
lama bade ente2l mn fragemnt la fragmnet 2aw activity best5dem badel l intent mostla7 tene esmo action

iza ro7na 3ala l android 3al editor 3ande 4 destination login home,detils,notification
bade heda l destination login yente2l lal home destination fe 3ande circle 3al yamen bes7aba w berbota b tene w bas 3mlt hay l 7arake zahar 3ande bel xml action
iza bshof l code bde5el l fragemnt tag fe tag tene esmo action elo attribute esmo destination l wejha heye home destination bma3na eno l wejha le 7a ente2l 3lyha heye l home destination mn 5elel l id
w kamen momken ana bade erja3 mn l home destination la l logindestintion kamen bshel l circle w berbota bel login w bahy tare2a berbot l destinations mn 5elel l actions


navigate to destination:
ne7na zakrna eno l actions howe le b7aded fe kel fragemnt 2aw activity 7a tente2 3ala aye fragemnt 2aw aye activity ya3ne kel destination la aye destination bada trou7 bas meen le 7a ynzem heda l mawdo3?
ne7na 2olna abl 7kena 3an nav controller 3an tare2 navcontroller be2dar 3an tare2o ente2l mn destination la destination
tyeb keef bade e7sal 3ala navcontroller:
Fragmnet.findNavController();:hay l method heye le 7a tjeble l navcontroller la7ata 2e2dar enten2l been destination

2w momken  View mo3yan 3ande button masln:
View.findnavcontroller();

2aw momken 3an tare2 acivity:
Activity.FindNavController(Viewid:id) w ba3te l id

heed l code 7a ntab2o


bas nenshe2 navhostfragemnt be2sta5dem l fragemntcontainerview 2aw momken defo bshakl yadawe l navhostfragemnt lal activity le 5as fena be2ste5dem FragmnetTransaction ba3den ba3mel retrive lal navcontroller b function l oncreate houn l activity la7 yefshal bel 7osol 3ala navcontroller heda she fa yofadal deymn na3mel navController directory mn navhostfragemnt ya3ne na3mel retrive lal navcontroller le 7a y5lena net7akam 3an tare2 navhostfragemnt w ma mna3mel tare2t fragemnttransaction w ba3den na3mel Fragemnt.findnavController(Activity.@idRes in)


keef mne7sal 3ala navhost fragement ma howe mesh badna navhostfragemnt 3ashen njeeb mneo l navcontroller 2olna eno hay tare2a sa7:
NavHostFragemnt navhostfragemnt=supportfragemntmanager.findFragmmetbyid(R.id.navhostfragemnt) w ba3den ba3mel casting la navhostfragemnt
Navcontroller navcon=navhostfragemnt.navcontroller
3ande fragemntconatinerview l id ta3elo nav_host_fragemnt w 7atet l name howe navhostfragmnet fa bas la eje 2a3ml retrive lal navhostfragemnt ba3mlo mn 5elel l id taba3 l container le howe sa7 navhost



w 2e5er mawdo3 3ana howe ensure type-safety by using Safe args:
fe tare2a she23a lala ente2al been destinations howe nest5dem plugin ya3tena l amen aktar w yedman l ente2al been destination heda l plugin
 implementation(libs.navigation.safe.args.gradle.plugin)




hala2 badna nbalesh bel application tatabe2:
1-2awl she mndeef l plugin
2- rightclick 3ala resource new resource folder resourcetype navigation w ba3emel esm nav_grapph 3ashen enshe2 navgraph
3-ba3mel she 2 fragemnt firstfragemnt secondfragemnt   bem7e kel she fe w betrek oncreateview
4-berou7 3ala l navgraph ba3mel 2 destination b7aded l first fragemnt w second fragemnt tene destination
5-ba3d ma 5alst l destination lezm 7ot hawde l destination bel navhost ba3mel bel activity contianer fragement w b7aded name,id,navgraph w deffultnavhost true
6-hala2 sar jehez l nafigation graph w navhost hala2 bade 2a3mel l navcontroller le howe l moder le 7a yetwala 3mlyet ta3amoul ma3 sho mawjoud bede5l l navhost ya3ne hala2 b2alb l navhost fe 2 fragement meen le 7a yon2lne mn fragemnt l 2awl la tene 2aw mn tene lal 2awl  l navcontroller keef be7sal 3ala l navcontroller mn 5elel l navhost :
7-hala2 3mlt restrive lal navhostfragemnt ba3den jebt meno l navcontroller hala2 3an tare2 object l navcontroller be2dar ente2l mn fragemnt l 2awl la tene w mn tene lal 2awl  w heek
8-hala2 brou7 3ala l first fragemnt layout bdeef button w id lal button ba3den brou7 3ala l first fragemnt be7tej de5el l fragemnt w be7tej l nav controller kamen ya3ne aye sha8le ana b7aje 2a3mla ente2l 2aw she bade nav controller laken hala2 ana bade heeed l object l navcontroller bede5l l fragemnt feek bade e7sal 3lee de5el l fragemnt mn 5elel bel onviewcreate b3aref variable bara mn no3 Mnavcontroller w beje de5el l oncreate ba3mel intilze lal mnavcontroller mnavfontroller=findnavcontrolller() hala2 sar 3ande l nav controller hala2 bade bas l user yed8at 3ala l button yent2l destination 2 fragemnt 2 bjeeb l l button bel onviewcreate ba3mel onclick listner w b2lab listner b7ot mnavcontroller.navigate(R.id.secondfragemnt) ya3ne 3meel navigate la destimation second fragemnt bas tekbous hay l button bas hay tare2a mana mo7abaze l2no mafeha ruesability

tare2a tenye l a7san heye ta3ml click lisner mn l fragment terja3 mn l mainactivity ta3mel navigate

hala2 keef fene 2ons2ol data mn fragment l first la fragemnt second
fene eb3at bundle w est2bela bel fragemnt 2 bet get argumnet bas heek 8alat

b2ololak iza kenet badak ten2el data mn destination la destination 2aw tente2l bedoun data yofadal eno safety method le befwerlna yeha l android be2olola safe args
hala2 la nest5dema byeje dour l actions le 7kena 3anon
ana  bade ente2l mn first fragemnt la second fragment mesh betare2t navigate(R.id.scondfragemnt)

bade ente2l 3an tare2 l action 2awl she ba3ml 5at mn firstfragemnt la second fragmnet 2awl ma 3mlta tele3 3ande action
<action
            android:id="@+id/action_first_fragmnet_to_Second_fragmnet"
            app:destination="@id/Second_fragmnet" />

            tele3 3ande action 3ata id eno heda l action mn l firstfragemnt la second fragemnt w 3ata destination secondfragemnt ya3ne heda l action la7 ye5dne mn l firstfragmnet la secondfragemnt
            ya3ne heda l action le 2elo id action_first_fragmnet_to_Second_fragmnet 7a ye5dne 3ala destination second fragemnt



hala2 keef mnest5dmo bel code :

ba3mel variable mno3 NavDirections navdi = firstfragmnetDirections dot fe function esma actionFirstFragmentToSecondFragment() law re7t 3ala hay lmethod bt2asher 3ala l action :
<action
            android:id="@+id/action_first_fragmnet_to_Second_fragmnet"
            app:destination="@id/Second_fragmnet" />

iza mnla7ez l id action_first_fragmnet_to_Second_fragmnet howe nafs esm l function bas b7rouf kbera

ba3den b2olo navcontorler.navigate(varibale le howe l navdirection)

keef hala2 bade ersel data:
hala2 l fragemnt le bade ente2el 3lyha heye l fragment 2
fa bed8at 3ala secondfragment:
fe 3ande bel attribute esma arguments b7ot plus ba3te esm l argument  malsn w
ba3den b2olak sho naw3o 2olo string ba3den iza rje3na 3al function le 3mlna ta3et direction 3atak error

7a y2olak enta 3am tente2el la second fragment 3al new destination heda destination be7aje tmarer elo keme mn no3 string feef b marera hay l keme
 bekl basata ma3mel variable maln data w ba3te esm "khaled"
w hay l varibale ba3tah lal function w 3meel run
de8re na2alk 3al new fragemnt w tab3lk l kebe b toast




hala2 badna njareb b 3 fragemnts w badna nshof keef l backtracks bteshte8l:

hala2 3mlna 3 fragemnt kabsna 2awl mara 3al button b 2awl fragemnt ra7et 3al tene fragemnt rj3na kabsna 3ala button b tene fragemnt ra7et 3al tetet fragemnt
bas hala2 iza 3mlna back mn 3 7a trou7 3al tenye rj3na 3mlna back ro7na 3al 2ola hay deffult behavoir ta3el l backstack
bas ne7na 2aw2at be7aje masln bas nosal lal 2a5era na3ml back yrj3le 3al fragemnt l 2ola ya3ne bas na3mel back nerja3 mn l fthird fragemnt to first fragment fena na3mela mn 5elel:
iza ro7na 3ala navgraph fe attribute bel action le bte5dne mn second fragemnt to third fe attribute esma popup bta7deda firstfragemnt hayde l attribute b5ale hay l action ta3ref eno iza 3mlt back button inside fragemnt 3 something different will happen navigation graph 7a ya3mel poping to firstfragment
heye ma3neta bshakl 2awda7 eno bas trou7 mn second fragemnt la third fragemnt mn 5elel hay l action bas terja3 ta3mel back button tale3 kelshe mn l back stack la 3end l fragmnet 1
tyeb barke badaak bas ta3mel popup tetal3 mn l app mesh terja3 3ala 2awl fragemnt bt2olo popup=""bta3te l id ta3et navigation sa3eta 3am t2olo fadele kel l satck la 3end navigation le howe ma3ad fe she b2laba fa byetla3 mn l appp





hala2 ne7na shofna keef fena nesrsel data forward mn fragemnt la fragemnt tyeb hala2 badnanshof keef fena nraje3 data mn fragemnt la fragemnt ya3ne nraje3 data mn fragemnt la previous fragment:
2awl she 5alena nshel l popup ana bade yeha normally l back stack

7a nshof tare2ten keef fena nersel data la previous fragemnt w 7a nshof aye tare2a l afdal:

2awal tare2a:7a nest3mel l navigation controller badna neb3at data mn second fragemnt to first fragemnt 7a nrou7 3ala l second fragemnt w eb3at sample data string la first fragment be2ste3mel l navigation controller bas bel second fragemnt ma 3ande acces 3ala l navigation controller fa bade jeeb reference 3ala l navigation controller be2ste3ml l function findnavcontroller navController= Navigation.findNavController(view); hay l method btejbalk l navcontroller bel scope ta3el l second fragemnt l2no second fragemnt howe part mn l mainactivity l2no secondfragemnt mawjoude bel navgraph le howe 7atyne bel mainactivity bel fragemntcontroller ba3den hay l method l findnavcontroller b2alab method esma getPreviousBackStackEntry(); hay l method btejblak destination ta3el l previous entry le howe bhay l 7ale l firstfragemnt ba3den btjeeb mn hay l function l savedstatehandle key value bt5alek tsayev different type of data heye nafsa zeta save state le mnshofa bel oncreate parameter ta3el l ocreate method bel activity heye 3ebara 3an bundle bt5lek tsayev eshya feha bhay l 7ale enta 3am tjeeb l bundle ta3et l previousbackstack le heye l firstfragemnt fa hala2 badak t7ot value b2lab hayde l saved satethandele le heye l baundle ta3et l firstfragemnt mn 5elel method esma set bte5od key value w value hala2 ba3d ma 3mlna kel hay lezm nest2bel hay data bel first fragemnt w n7eta be textview         Navigation.findNavController(view).getPreviousBackStackEntry().getSavedStateHandle().set("stringkey","data from second fragemnt");
hala2 bel firstfragemnt bjeeb kamn navegation controller bas bjeeb l currecnt back stack le howe l firstfragemnt ba3den l saved satate handle ta3et l firstfragemnt ba3d heek fe method 3ande esma getlivedata houn bdna hay l method l2no yemken hay data le bel second fragemnt le ba3tneha 3ala l firstfragemnt kel mara tet8ayar fa bhay l method kel mara bjeblak l livedata
live data how special type of class that have perpous of holding some certain data w hay live data btse3dna bhay l 7ale l2no it will let us observe the changes that is happing in our data
l getlive data how class mn7ot l type of data le 7a test2blo le heye string

w la7ta nla7ez l observer change of this key le heye l stringkey b7ot e5er she dot observe() function bhay l 7ale livedata bt5ale many commponenet listen lal changes that happening to this key String key

function l observe() bte5od commponenet 3anda life cycle metl l fragemnt 2aw l activity fa b2lab l parameter lezm te5od l lifecyceleowner bhay l case le 3ande yeha heye l fragemnt bas ne7na 7a na3te parameter viewlifecycelowner l2no ne7na badna na3te lifecyele of  of view ta3et l onviewcreate hay recommended approuach w tene parameter howe string value le 7a yejene ba3en befra7 lamda expersion 3ashen houn sar feek ta3mel acces 3ala l string value le 7a yejene

Navigation.findNavController(view).getCurrentBackStackEntry().getSavedStateHandle().getLiveData("stringkey").observe(getViewLifecycleOwner(),Stringvalue->{
                textView.setText(Stringvalue.toString());



            });

            l observe heye bte5od viewlifecycleowner le heye l view le b2laab l fragemnt hay l observe bedal 3am ta3mel observe la hay l keyvalue as long this fragemnt 2aw this view can observe this key value ya3ne kel ma heye bel active state hay l fragemnt feha ta3mel observe la hay l key kel ma l first fragemnt bel onstart w l on resume hawde l active state


fe tare2a tenye la7 nest5dema la7a nersel data mn third fragemnt to second fragemnt:


2awl she badna nrou7 3ala third fragment

2awl she lezm na3ref eno both fragemnet l 2 w 3 7ata l 1 koloun  be nafs l activity

inside l onviewcreate call class parentfragmnetmanager l manager ta3el l fragemnt l howe l mainactivity w fe method b2alb heda l class esma setfragemntresult() hay l method bte5od key w value kamen exmple 7ot "requestkey" w value howe bye5od bundle fa mna3mel bundle w mne7ot data b2lab hay l bundle feek ta3mel bundle w ta3mel put 2aw ta3mel bundle.apply() b2lab l apply feek t7ot integer string le badak yeh putstring

 class l getparentfragemntmanager btejblak l fragemnt manager ta3el l conatiner ma7al ma bta3mel host la hay l fragemnt le heye l navhostfragemnt ya3ne braj3lk l fragemnt manager taba3 navhostfragemnt le howe contain hayde l fragemnt  le howe heda l fragemntmmanager responisble la ya3mel transaction w yzabet l backstack tba3 l fragemnt w kel she mnshofo edemna b2albo fe method esa setfragemntresult() bt5od key w value howee bundle
 hala2 bel second fragemnt badna njeeb hay l value w na3mel update la textview le mawjoude bel second fragment
 bel secondfragemnt kamen mnjeeb l parentfragemnt w mnjeeb b2alab method esma setfragmentlistner() bet5od key  w ba3den bte5od lifecycelowner w telet parameter howe request key le enta ba3ato w result le howe l bundle mna3mela as lamda expretion

 hay listner byan3mla call bel onviewcreated bas nerja3 lal fragemnt bel back button mn l third fragmnet  w setresutl bel 3ade mna3mela bel button bas ne7na badna yeha bas nerja3 bel back button
 bas ne7na badna 2awl ma nefta7 l fragemn l third mneb3at hay data sa3eta bas na3mel back 7a terja3 l fragemnt second yen3amla call fa 7a tfout 3ala l onviewcreated w listner heda 7a ydalo 3am ya3mel listner 3ala hayde l key 7a yshofa eno rje3t ya3ne l fragemnt managr howe metl moder 2awl she l fragemnt third ba3tet data b2lab requst key ne7na bel second 2olnelo ya fragemntmanager 5alek mntebh iza ejene data mn hay l requset key nafez l jowete ya3ne howe 7a ydalo 3am ya3mel listner w 7a y2olo lala fragemnt manager if any fragemnt send me data with this request key tell me la nafez l mo7tawa le jowete


haw houne tare2ten hala2 tare2ten sa7 w byezbato bas l a7san nest5dem tenye more professional bas l 2ola kamen btesta5dam w sa7

*/








public class MainActivity extends AppCompatActivity implements firstFragment.click,secondFragment.onclick2{

    NavController controller;
    NavHostFragment navhost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navhost=(NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host);

        if(navhost!=null){
            controller=navhost.getNavController();

        }


    }

    @Override
    public void onclick() {
        //hay tare2a l ademe
        //controller.navigate(R.id.Second_fragmnet);


        //hala2 iza badna nest3mel l action bas ma nersel data fena heek  method le esma actionfirstfragmnettosecondfragmnet() ma bte5od parameter so ma btersel data ma 7atyneha eno secondfragmnet btest2bel data
        //NavDirections directions=firstFragmentDirections.actionFirstFragmnetToSecondFragmnet();
        //controller.navigate(directions);

        //hala2 iza bade ersel fene ersel integer,string,float..ect w fene ersel paracble object w serializable object fa fene 2a3ml class esmo secondfragemntinput ba3d ma 3mlna heda l class 7atna serializable brou7 3ala l navgraph
        //bekbous 3ala fragemnt 2 le heye badna neb3tla data fa 3mlna argument mn no3 serializable w 3atyto l class w l esm howe ftinput
        SecondfragmentInput sfinput=new SecondfragmentInput("khaled");
        NavDirections navDirections=firstFragmentDirections.actionFirstFragmnetToSecondFragmnet(sfinput);
        controller.navigate(navDirections);

    }

    @Override
    public void clickitem() {

        //bas fena 3ashn ma yseer ma3na crush fena n2olo bhay tare2a enta 3am t2aked eno currently enta bel second fragemnt
        if(controller.getCurrentDestination().getId()==R.id.Second_fragmnet){
            SecondfragmentInput sfinput=new SecondfragmentInput("assidi");
            NavDirections navDirections=secondFragmentDirections.actionSecondFragmnetToThirdFragment(sfinput);
            controller.navigate(navDirections);
        }

    }
}