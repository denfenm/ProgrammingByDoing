
public class Animation {

		public static void main(String[] args) throws Exception
		{
			int repeats = 5;
			int steps_per_second = 10;

			for ( int i=0; i<repeats*9 ; i++ )
			{
				if ( i%9 == 0 )
				{
					System.out.print(" \t\t   \r\n" + 
							"\r\n" + 
							"               _-o#&&*''''?d:>b\\_\r\n" + 
							"          _o/\"`''  '',, dMF9MMMMMHo_\r\n" + 
							"       .o&#'        `\"MbHMMMMMMMMMMMHo.\r\n" + 
							"     .o\"\" '         vodM*$&&HMMMMMMMMMM?.\r\n" + 
							"    ,'              $M&ood,~'`(&##MMMMMMH\\\r\n" + 
							"   /               ,MMMMMMM#b?#bobMMMMHMMML\r\n" + 
							"  &              ?MMMMMMMMMMMMMMMMM7MMM$R*Hk\r\n" + 
							" ?$.            :MMMMMMMMMMMMMMMMMMM/HMMM|`*L\r\n" + 
							"|               |MMMMMMMMMMMMMMMMMMMMbMH'   T,\r\n" + 
							"$H#:            `*MMMMMMMMMMMMMMMMMMMMb#}'  `?\r\n" + 
							"]MMH#             \"\"*\"\"\"\"*#MMMMMMMMMMMMM'    -\r\n" + 
							"MMMMMb_                   |MMMMMMMMMMMP'     :\r\n" + 
							"HMMMMMMMHo                 `MMMMMMMMMT       .\r\n" + 
							"?MMMMMMMMP                  9MMMMMMMM}       -\r\n" + 
							"-?MMMMMMM                  |MMMMMMMMM?,d-    '\r\n" + 
							" :|MMMMMM-                 `MMMMMMMT .M|.   :\r\n" + 
							"  .9MMM[                    &MMMMM*' `'    .\r\n" + 
							"   :9MMk                    `MMM#\"        -\r\n" + 
							"     &M}                     `          .-\r\n" + 
							"      `&.                             .\r\n" + 
							"        `~,   .                     ./\r\n" + 
							"            . _                  .-\r\n" + 
							"              '`--._,dd###pp=\"\"'\r\n" + 
							"\r");
				
				} else if ( i%9 == 1 ) {
					System.out.print(" \t\t   _v->#H#P? \"':o<>\\_\r\n" + 
							"          .,dP` `''  \"'-o.+H6&MMMHo_\r\n" + 
							"        oHMH9'         `?&bHMHMMMMMMHo.\r\n" + 
							"      oMP\"' '           ooMP*#&HMMMMMMM?.\r\n" + 
							"    ,M*          -     `*MSdob//`^&##MMMH\\\r\n" + 
							"   d*'                .,MMMMMMH#o>#ooMMMMMb\r\n" + 
							"  HM-                :HMMMMMMMMMMMMMMM&HM[R\\\r\n" + 
							" d\"Z\\.               9MMMMMMMMMMMMMMMMM[HMM|:\r\n" + 
							"-H    -              MMMMMMMMMMMMMMMMMMMbMP' :\r\n" + 
							":??Mb#               `9MMMMMMMMMMMMMMMMMMH#! .\r\n" + 
							": MMMMH#,              \"*\"\"\"\"`#HMMMMMMMMMMH  -\r\n" + 
							"||MMMMMM6\\.                    {MMMMMMMMMH'  :\r\n" + 
							":|MMMMMMMMMMHo                 `9MMMMMMMM'   .\r\n" + 
							". HMMMMMMMMMMP'                 !MMMMMMMM    `\r\n" + 
							"- `#MMMMMMMMM                   HMMMMMMM*,/  :\r\n" + 
							" :  ?MMMMMMMF                   HMMMMMM',P' :\r\n" + 
							"  .  HMMMMR'                    {MMMMP' ^' -\r\n" + 
							"   : `HMMMT                     iMMH'     .'\r\n" + 
							"    -.`HMH                               .\r\n" + 
							"      -:*H                            . '\r\n" + 
							"        -`\\,,    .                  .-\r\n" + 
							"          ' .  _                 .-`\r\n" + 
							"              '`~\\.__,obb#q==~''' \r");
			
				} else if ( i%9 == 2 ) {
					System.out.print(" \t\t\r\n" + 
							"              .ovr:HMM#?:`' >b\\_\r\n" + 
							"          .,:&Hi' `'   \"' \\\\|&bSMHo_\r\n" + 
							"        oHMMM#*}          `?&dMMMMMMHo.\r\n" + 
							"     .dMMMH\"''''           ,oHH*&&9MMMM?.\r\n" + 
							"    ,MMM*'                 `*M\\bd<|\"*&#MH\\\r\n" + 
							"   dHH?'                   :MMMMMM#bd#odMML\r\n" + 
							"  H' |\\                  `dMMMMMMMMMMMMMM9Mk\r\n" + 
							" JL/\"7+,.                `MMMMMMMMMMMMMMMH9ML\r\n" + 
							"-`Hp     '               |MMMMMMMMMMMMMMMMHH|:\r\n" + 
							":  \\\\#M#d?                `HMMMMMMMMMMMMMMMMH.\r\n" + 
							".   JMMMMM##,              ``*\"\"'\"*#MMMMMMMMH\r\n" + 
							"-. ,MMMMMMMM6o_                    |MMMMMMMM':\r\n" + 
							":  |MMMMMMMMMMMMMb\\                 TMMMMMMT :\r\n" + 
							".   ?MMMMMMMMMMMMM'                 :MMMMMM|.`\r\n" + 
							"-    ?HMMMMMMMMMM:                  HMMMMMM\\|:\r\n" + 
							" :     9MMMMMMMMH'                 `MMMMMP.P.\r\n" + 
							"  .    `MMMMMMT''                   HMMM*''-\r\n" + 
							"   -    TMMMMM'                     MM*'  -\r\n" + 
							"    '.   HMM#                            -\r\n" + 
							"      -. `9M:                          .'\r\n" + 
							"        -. `b,,    .                . '\r\n" + 
							"          '-\\   .,               .-`\r\n" + 
							"              '-:b~\\\\_,oddq==--\"\r\n" + 
							"\r");
	
				} else if ( i%9 == 3 ) {
					System.out.print(" \t\t    _oo##'9MMHb':'-,o_\r\n" + 
							"          .oH\":HH$' \"\"'  \"' -\\7*R&o_\r\n" + 
							"       .oHMMMHMH#9:          \"\\bMMMMHo.\r\n" + 
							"      dMMMMMM*\"\"'`'           .oHM\"H9MM?.\r\n" + 
							"    ,MMMMMM'                   \"HLbd<|?&H\\\r\n" + 
							"   JMMH#H'                     |MMMMM#b>bHb\r\n" + 
							"  :MH  .\"\\                   `|MMMMMMMMMMMM&\r\n" + 
							" .:M:d-\"|:b..                 9MMMMMMMMMMMMM+\r\n" + 
							":  \"*H|      -                &MMMMMMMMMMMMMH:\r\n" + 
							".    `LvdHH#d?                `?MMMMMMMMMMMMMb\r\n" + 
							":      iMMMMMMH#b               `\"*\"'\"#HMMMMMM\r\n" + 
							".   . ,MMMMMMMMMMb\\.                   {MMMMMH\r\n" + 
							"-     |MMMMMMMMMMMMMMHb,               `MMMMM|\r\n" + 
							":      |MMMMMMMMMMMMMMH'                &MMMM,\r\n" + 
							"-       `#MMMMMMMMMMMM                 |MMMM6-\r\n" + 
							" :        `MMMMMMMMMM+                 ]MMMT/\r\n" + 
							"  .       `MMMMMMMP\"                   HMM*`\r\n" + 
							"   -       |MMMMMH'                   ,M#'-\r\n" + 
							"    '.     :MMMH|                       .-\r\n" + 
							"      .     |MM                        -\r\n" + 
							"       ` .   `#?..    .             ..'\r\n" + 
							"           -.     _.             .-\r\n" + 
							"              '-|.#qo__,,ob=~~-'' \r");
		
				} else if ( i%9 == 4 ) {
					System.out.print(" \t\t _ood>H&H&Z?#M#b-\\.\r\n" + 
							"          .\\HMMMMMR?`\\M6b.\"`' ''``v.\r\n" + 
							"       .. .MMMMMMMMMMHMMM#&.      ``~o.\r\n" + 
							"     .   ,HMMMMMMMMMMMM*\"'-`          &b.\r\n" + 
							"    .   .MMMMMMMMMMMMH'               `\"&\\\r\n" + 
							"   -     RMMMMM#H##R'                   4Mb\r\n" + 
							"  -      |7MMM'    ?::                 `|MMb\r\n" + 
							" /         HMM__#|`\"\\>?v..              `MMML\r\n" + 
							".           `\"'#Hd|       `              9MMM:\r\n" + 
							"-                |\\,\\?HH#bbL             `9MMb\r\n" + 
							":                   !MMMMMMMH#b,          `\"\"T\r\n" + 
							".              .   ,MMMMMMMMMMMbo.           |\r\n" + 
							":                  4MMMMMMMMMMMMMMMHo        |\r\n" + 
							":                   ?MMMMMMMMMMMMMMM?        :\r\n" + 
							"-.                   `#MMMMMMMMMMMM:        .-\r\n" + 
							" :                     |MMMMMMMMMM?         .\r\n" + 
							"  -                    JMMMMMMMT'          :\r\n" + 
							"  `.                   MMMMMMH'           -\r\n" + 
							"    -.                |MMM#*`            -\r\n" + 
							"      .               HMH'            . '\r\n" + 
							"        -.            #H:.          .-\r\n" + 
							"          ` .           .\\       .-\r\n" + 
							"              '-..-+oodHL_,--/-`\r\n" + 
							" \r");
			
				} else if ( i%9 == 5 ) {
					System.out.print("\t\t,\\?dZkMHF&$*q#b..\r\n" + 
							"          .//9MMMMMMM?:'HM\\\\\"`-''`..\r\n" + 
							"       ..`  :MMMMMMMMMMHMMMMH?_    `-\\\r\n" + 
							"     .     .dMMMMMMMMMMMMMM'\"'\"       `\\.\r\n" + 
							"    .      |MMMMMMMMMMMMMR              \\\\\r\n" + 
							"   -        T9MMMMMHH##M\"                `?\r\n" + 
							"  :          (9MMM'    !':.               &k\r\n" + 
							" .:            HMM\\_?p \"\":-b\\.            `ML\r\n" + 
							"-                \"'\"H&#,       :           |M|\r\n" + 
							":                     ?\\,\\dMH#b#.           9b\r\n" + 
							":                        |MMMMMMM##,        `*\r\n" + 
							":                   .   +MMMMMMMMMMMo_       -\r\n" + 
							":                       HMMMMMMMMMMMMMM#,    :\r\n" + 
							":                        9MMMMMMMMMMMMMH'    .\r\n" + 
							": .                       *HMMMMMMMMMMP     .'\r\n" + 
							" :                          MMMMMMMMMH'     .\r\n" + 
							"  -                        :MMMMMMM'`      .\r\n" + 
							"  `.                       9MMMMM*'       -\r\n" + 
							"    -.                    {MMM#'         :\r\n" + 
							"      -                  |MM\"          .'\r\n" + 
							"       `.                &M'..  .   ..'\r\n" + 
							"          ' .             ._     .-\r\n" + 
							"              '-. -voboo#&:,-.-`\r\n" + 
							"\r");
	
				} else if ( i%9 == 6 ) {
					System.out.print(" \t\t_oo:\\bk99M[<$$+b\\.\r\n" + 
							"           .$*\"MMMMMMMM[:\"\\Mb\\?^\" .\r\n" + 
							"       . '`    HMMMMMMMMMMHMMMM+?.  `.\r\n" + 
							"     .        .HMMMMMMMMMMMMMMP\"''     .\r\n" + 
							"    .         `MMMMMMMMMMMMMM|         -`.\r\n" + 
							"   -           `&MMMMMMHH##H:             :\r\n" + 
							"  :             `(*MMM}    `|\\             |\r\n" + 
							" : `-              ?MMb__#|\"\"`|+v..         \\\r\n" + 
							".                    `''*H#b       -        :|\r\n" + 
							":                         `*\\v,#M#b#,        \\\r\n" + 
							".                             9MMMMMMHb.     :\r\n" + 
							":                        .   #MMMMMMMMMb\\    -\r\n" + 
							"-                           .HMMMMMMMMMMMMb  :\r\n" + 
							":                            `MMMMMMMMMMMMH  .\r\n" + 
							"-:  .                         `#MMMMMMMMMP   '\r\n" + 
							" :                              ]MMMMMMMH'  :\r\n" + 
							"  -                            ,MMMMMM?'   .\r\n" + 
							"  `:                           HMMMMH\"    -\r\n" + 
							"    -.                       .HMM#*     .-\r\n" + 
							"     `.                     .HH*'     .\r\n" + 
							"       `-.                  &R\".    .-\r\n" + 
							"           -.               ._   .-\r\n" + 
							"              '-. .voodoodc?..-`\r");
			  
				} else if ( i%9 == 7 ) {
					System.out.print(" \t\t _\\oo\\?ddk9MRbS>v\\_\r\n" + 
							"          ..:>*\"\"MMMMMMMMM:?|H?$?-.\r\n" + 
							"       ..- -     \"HMMMMMMMMMMHMMMH\\_-.\r\n" + 
							"     .            dMMMMMMMMMMMMMMT\"    .\r\n" + 
							"    .             TMMMMMMMMMMMMMM       `.\r\n" + 
							"   -               `&HMMMMMM#H#H:         .\r\n" + 
							"  -                 `\\7HMMH     |\\.        .\r\n" + 
							" :    `                 HMM\\_?c`\"\"+?\\..     :\r\n" + 
							"-                         \"``#&#|      .     -\r\n" + 
							":                              `?,\\#MHdb.    .\r\n" + 
							":                                 |MMMMMH#.  :\r\n" + 
							":                            .   ,HMMMMMMMb, -\r\n" + 
							": '                              4MMMMMMMMMMH`\r\n" + 
							":   .                             9MMMMMMMMMT-\r\n" + 
							":.`                               `#MMMMMMMH '\r\n" + 
							" :      '                           HMMMMMH':\r\n" + 
							"  -                                |MMMMH\" -\r\n" + 
							"  `:                              |MMMH*' .'\r\n" + 
							"    '?                           dMM#'   .\r\n" + 
							"      \\.                       .dH\"    .'\r\n" + 
							"        -.                    ,M'-  ..'\r\n" + 
							"          ` .                .. ..-`\r\n" + 
							"              '-. .\\ooooboo<^.-`\r");
				
				} else if ( i%9 == 8 ) {
					System.out.print(" \t\t  \r\n" + 
							"              _o,:o?\\?dM&MHcc~,.\r\n" + 
							"          ..^':&#\"\"HMMMMMMMM$:?&&?.\r\n" + 
							"        .`  -`      'HMMMMMMMMMHMMMp\\.\r\n" + 
							"     . '             |MMMMMMMMMMMMMM\"' .\r\n" + 
							"    .                `9MMMMMMMMMMMMM    -.\r\n" + 
							"   -                   `*9MMMMMHH##[      .\r\n" + 
							"  -                     `\\Z9MMM    `~\\     .\r\n" + 
							" :       '|                 ?MMb_?p\"\"-?v..  :\r\n" + 
							"-                             `\"'*&#,    -   .\r\n" + 
							":                                  `?,oHH#?  .\r\n" + 
							"--                                    |MMMMH,:\r\n" + 
							":                                 .  |MMMMMM6,\r\n" + 
							":   -                                |MMMMMMMM\r\n" + 
							"?                                     HMMMMMMP\r\n" + 
							"-- . '                                |HMMMMM'\r\n" + 
							" :.`     .  '                          JMMMM+\r\n" + 
							"  \\                                   ,MMMP:\r\n" + 
							"   :                                 |MMH?:\r\n" + 
							"    -:\\.                            dM#\" .\r\n" + 
							"       \\                          ,H*' .'\r\n" + 
							"        -.                       d':..'\r\n" + 
							"          ` .                  .,.-\r\n" + 
							"              '-.. .\\oooodov~^-` \r");
					
				}
//				else if ( i%9 == 9 )
//					System.out.print(" \t\t       || \r");
//				else if ( i%9 == 10 )
//					System.out.print(" \t\t      /)|__. \r");
				 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n...");
				Thread.sleep(100);
			}
		
//			public static void menuOpt throws Exception 
//			{
			
			System.out.print("\t\tWelcome to 4.51's Quiz Game,\t\t WHERE WE EDUCATE YOU ON THE ENVIRONMENT!!");
			
			Thread.sleep(1000);
			
			System.out.println("\n\n\t\tType in \"yes\" to start the program\n\n\t\tType in \"exit\" to terminate the program.");
		}}
		
		
	