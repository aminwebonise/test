
public class rajamantri extends Activity {

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onPostResume() {
        // TODO Auto-generated method stub
        super.onPostResume();
    }

    @Override
    public boolean onKeyDown(int keycode, KeyEvent event) {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("Exit game!");
        dialog.setMessage("Are you sure you want to exit the game?");
        dialog.setButton("Exit", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });
        dialog.setButton2("Cancel", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();

            }
        });
        dialog.show();
        return super.onKeyDown(keycode, event);
    }

    @Override
    public void onLowMemory() {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("Low memory!");
        dialog.setMessage("Too many apps open, kindly close some other apps and try again!");
        dialog.setButton("Exit", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });

        dialog.show();


        super.onLowMemory();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
    String[] solutionarray = {"RAJA", "MANTRI", "CHOR", "SIPAHI"};
    String[] playersarray = {"Player1", "Player2", "Player3", "Player4"};
    static String player1_name = "";
    static String player2_name = "";
    static String player3_name = "";
    static String player4_name = "";
    static String player1_role = "";
    static String player2_role = "";
    static String player3_role = "";
    static String player4_role = "";
    static boolean guess = false;
    static String player1 = "";
    static String player2 = "";
    static String player3 = "";
    static String player4 = "";
    static int i = 0, j = 0, k = 0, l = 0;
    static int p1score = 0;
    static int p2score = 0;
    static int p3score = 0;
    static int p4score = 0;
    int count = 0;
    Button btnrajamantri;
    Button btnhelp;
    ImageView btn9;
    Button btnplay;
    static Button btnpod1;
    static Button btnpod2;
    static Button btnpod3;
    static Button btnpod4;
    Button btnshowresult;
    Button btnrestart;
    Button btnsignin;
    Button btnguess;
    EditText edittxtplayer1;
    EditText edittxtplayer2;
    EditText edittxtplayer3;
    EditText edittxtplayer4;
    EditText edt2;
    EditText edt3;
    EditText edt4;
    TextView lblplayer1;
    TextView lblplayer2;
    TextView lblplayer3;
    TextView lblplayer4;
    static TextView txtturn;
    static TextView txtplayer1;
    static TextView txtplayer2;
    static TextView txtplayer3;
    static TextView txtplayer4;
    Bundle savedinstancestate2;
    Button btnmainmenu;
    String nextturn = "";

    public void onRestart() {

        super.onRestart();
        /*
         * player1_name = "" ; player2_name = ""; player3_name = "";
         * player4_name = ""; guess = false; player1 = ""; player2 = ""; player3
         * = ""; player4 = ""; i=0;j=0;k=0;l=0; p1score = 0; p2score = 0;
         * p3score = 0; p4score = 0;
         */


    }

    public void onResume() {

        super.onResume();
        /*
         * player1_name = "" ; player2_name = ""; player3_name = "";
         * player4_name = ""; guess = false; player1 = ""; player2 = ""; player3
         * = ""; player4 = ""; i=0;j=0;k=0;l=0; p1score = 0; p2score = 0;
         * p3score = 0; p4score = 0;
         */


    }

    public void onCreate(Bundle savedinstancestate) {
        super.onCreate(savedinstancestate);
        setContentView(R.layout.welcome);

        i = 0;
        j = 0;
        k = 0;
        l = 0;
        btnhelp = (Button) findViewById(R.id.btnhelp);
        btnhelp.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                setContentView(R.layout.help);
                // Create the adView
                AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
                // Lookup your LinearLayout assuming it’s been given
                // the attribute android:id="@+id/mainLayout"
                LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayoutHelp);
                // Add the adView to it
                layout.addView(adView);
                // Initiate a generic request to load it with an ad
                adView.loadAd(new AdRequest());
                TextView txthelp = (TextView) findViewById(R.id.txthelp);
                String text = "Welcome to nostalgia! This is the paper free version of Raja Mantri Chor Sipahi.\n\nThe game involves bluffing with facial expressions and good guessing. This is a very popular childhood game in India played among kids often during their long summer vacations.\n\nThe game has 4 paper chits with Chor (thief), Sipahi (police), Raja (king) and Mantri (minister). The chits are folded at the start of the game and one of the 4 players will press SHUFFLE each one of the four players is supposed to secretly (by taking the phone and not letting the others see it)pick one chit by clicking on it, the player then clicks on the chit again to fold it back. All the players will then secretly open their chits and read what they have got. \n\nThe player who gets the chit with Raja written on it will say MERA MANTRI KAUN? (Who is my minister?). The player who got the chit with Mantri will say MEIN! (Me), The player with Raja will then say CHOR SIPAHI KA PATA LAGAO (find out who is the theif and who is the soldier). The player with Mantri will then guess who is the Chor (Thief), if he is wrong then his points are deducted and if he is correct he gets more points and the points from the player who got Chor (Thief) are deducted.\n\nIf the guess is correct the player with Chor is wrapped on his wrist by the Mantri, and if the Mantri is wrong then the Chor gets to hit his wrist.";
                txthelp.setText(text);
                Button btnback = (Button) findViewById(R.id.btnmainmenuHelp);
                btnback.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {

                        Intent i = new Intent(RajaMantri.this, RajaMantri.class);
                        RajaMantri.this.startActivity(i);
                        finish();

                    }
                });
            }
        });
        btnrajamantri = (Button) findViewById(R.id.btnrajamantri);
        btnrajamantri.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                setContentView(R.layout.rmcsp);
                // Create the adView
                AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
                // Lookup your LinearLayout assuming it’s been given
                // the attribute android:id="@+id/mainLayout"
                LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayoutPlayer);
                // Add the adView to it
                layout.addView(adView);
                // Initiate a generic request to load it with an ad
                adView.loadAd(new AdRequest());

                edittxtplayer1 = (EditText) findViewById(R.id.edittxtplayer1);
                edittxtplayer2 = (EditText) findViewById(R.id.edittxtplayer2);
                edittxtplayer3 = (EditText) findViewById(R.id.edittxtplayer3);
                edittxtplayer4 = (EditText) findViewById(R.id.edittxtplayer4);

                lblplayer1 = (TextView) findViewById(R.id.lblplayer1);
                lblplayer2 = (TextView) findViewById(R.id.lblplayer2);
                lblplayer3 = (TextView) findViewById(R.id.lblplayer3);
                lblplayer4 = (TextView) findViewById(R.id.lblplayer4);

                Display display = getWindowManager().getDefaultDisplay();
                int width = display.getWidth();
                int height = display.getHeight();



                lblplayer1.setGravity(Gravity.CENTER_HORIZONTAL);
                lblplayer2.setGravity(Gravity.CENTER_HORIZONTAL);
                lblplayer3.setGravity(Gravity.CENTER_HORIZONTAL);
                lblplayer4.setGravity(Gravity.CENTER_HORIZONTAL);


                Log.v("AkandBakar", "Playernames:" + player1_name);
                Log.v("AkandBakar", "Playernames:" + player2_name);
                Log.v("AkandBakar", "Playernames:" + player3_name);
                Log.v("AkandBakar", "Playernames:" + player4_name);

                btnmainmenu = (Button) findViewById(R.id.btnmainmenu);
                btnmainmenu.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        Intent i = new Intent(RajaMantri.this, RajaMantri.class);
                        RajaMantri.this.startActivity(i);
                        finish();

                    }
                });

                btnsignin = (Button) findViewById(R.id.btnsignin);
                btnsignin.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        // TODO Auto-generated method stub

                        player1_name = edittxtplayer1.getText().toString();
                        player2_name = edittxtplayer2.getText().toString();
                        player3_name = edittxtplayer3.getText().toString();
                        player4_name = edittxtplayer4.getText().toString();


                        if (player1_name.equals("") || player2_name.equals("") || player3_name.equals("") || player4_name.equals("")) {

                            Toast toast = Toast.makeText(getBaseContext(), "Enter player names!", 8000);
                            toast.show();

                        } else {
                            setContentView(R.layout.rmcsgnew);
                            // Create the adView
                            AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
                            // Lookup your LinearLayout assuming it’s been given
                            // the attribute android:id="@+id/mainLayout"
                            LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayout);
                            // Add the adView to it
                            layout.addView(adView);
                            // Initiate a generic request to load it with an ad
                            adView.loadAd(new AdRequest());

                            txtturn = (TextView) findViewById(R.id.txtturn);
                            txtturn.setText("Click on SHUFFLE!");
                            playersarray[0] = player1_name;
                            playersarray[1] = player2_name;
                            playersarray[2] = player3_name;
                            playersarray[3] = player4_name;



                            txtplayer1 = (TextView) findViewById(R.id.txtplayer1);
                            txtplayer1.setText("1." + player1_name + " [" + p1score + "]");

                            txtplayer2 = (TextView) findViewById(R.id.txtplayer2);
                            txtplayer2.setText("2." + player2_name + " [" + p2score + "]");

                            txtplayer3 = (TextView) findViewById(R.id.txtplayer3);
                            txtplayer3.setText("3." + player3_name + " [" + p3score + "]");

                            txtplayer4 = (TextView) findViewById(R.id.txtplayer4);
                            txtplayer4.setText("4." + player4_name + " [" + p4score + "]");

                            btnplay = (Button) findViewById(R.id.btnplay);

                            btnplay.setOnClickListener(new OnClickListener() {

                                public void onClick(View v) {
                                    // TODO Auto-generated method stub

                                    if (btnplay.getText().equals("SHUFFLE")) {

                                        RajaMantri.this.shuffle();

                                    } else {


                                        RajaMantri.this.makeGuess();

                                        Log.v("RajaMantri", "########## Player Name:" + player1_name + " Role:" + player1_role);
                                        Log.v("RajaMantri", "########## Player Name:" + player2_name + " Role:" + player2_role);
                                        Log.v("RajaMantri", "########## Player Name:" + player3_name + " Role:" + player3_role);
                                        Log.v("RajaMantri", "########## Player Name:" + player4_name + " Role:" + player4_role);
                                    }


                                }
                            });



                        }

                    }
                });
            }
        });


    }

    public void makeGuess() {

        btnplay.setText("SHUFFLE");
        count = 0;
        btnplay.setText("SHUFFLE");

        btnpod1.setClickable(true);
        btnpod2.setClickable(true);
        btnpod3.setClickable(true);
        btnpod4.setClickable(true);

        if (player1.equals("RAJA")) {

            btnpod1.setText("RAJA");
            btnpod1.setBackgroundResource(R.drawable.podopen);
            btnpod1.setClickable(false);
        }
        if (player2.equals("RAJA")) {

            btnpod2.setText("RAJA");
            btnpod2.setBackgroundResource(R.drawable.podopen);
            btnpod2.setClickable(false);
        }
        if (player3.equals("RAJA")) {

            btnpod3.setText("RAJA");
            btnpod3.setBackgroundResource(R.drawable.podopen);
            btnpod3.setClickable(false);
        }
        if (player4.equals("RAJA")) {

            btnpod4.setText("RAJA");
            btnpod4.setBackgroundResource(R.drawable.podopen);
            btnpod4.setClickable(false);
        }

        if (player1.equals("MANTRI")) {

            btnpod1.setText("MANTRI");
            btnpod1.setBackgroundResource(R.drawable.podopen);
            btnpod1.setClickable(false);
        }
        if (player2.equals("MANTRI")) {

            btnpod2.setText("MANTRI");
            btnpod2.setBackgroundResource(R.drawable.podopen);
            btnpod2.setClickable(false);
        }
        if (player3.equals("MANTRI")) {

            btnpod3.setText("MANTRI");
            btnpod3.setBackgroundResource(R.drawable.podopen);
            btnpod3.setClickable(false);
        }
        if (player4.equals("MANTRI")) {

            btnpod4.setText("MANTRI");
            btnpod4.setBackgroundResource(R.drawable.podopen);
            btnpod4.setClickable(false);

        }

        if (player1_role.equals("MANTRI")) {
            txtturn.setText(player1_name + " will find the CHOR!");
        }
        if (player2_role.equals("MANTRI")) {
            txtturn.setText(player2_name + " will find the CHOR!");
        }
        if (player3_role.equals("MANTRI")) {
            txtturn.setText(player3_name + " will find the CHOR!");
        }
        if (player4_role.equals("MANTRI")) {
            txtturn.setText(player4_name + " will find the CHOR!");
        }

        Log.v("AkhandBakar", "#########" + btnpod1.getText());

        if (btnpod1.getText().equals("")) {

            btnpod1.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Log.v("AkhandBakar", "#########" + player1);
                    if (player1.equals("CHOR")) {

                        RajaMantri.guess = true;
                        btnpod1.setBackgroundResource(R.drawable.podopen);
                        btnpod1.setText("CHOR");

                    } else {

                        RajaMantri.guess = false;
                        btnpod1.setBackgroundResource(R.drawable.podopen);
                        btnpod1.setText("SIPAHI");
                    }
                    btnpod1.setClickable(false);
                    btnpod2.setClickable(false);
                    btnpod3.setClickable(false);
                    btnpod4.setClickable(false);
                    updateScore();
                }
            });
        }


        Log.v("AkhandBakar", "#########" + btnpod2.getText());
        if (btnpod2.getText().equals("")) {

            btnpod2.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Log.v("AkhandBakar", "#########" + player2);
                    if (player2.equals("CHOR")) {

                        RajaMantri.guess = true;
                        btnpod2.setBackgroundResource(R.drawable.podopen);
                        btnpod2.setText("CHOR");
                    } else {

                        RajaMantri.guess = false;
                        btnpod2.setBackgroundResource(R.drawable.podopen);
                        btnpod2.setText("SIPAHI");

                    }
                    btnpod1.setClickable(false);
                    btnpod2.setClickable(false);
                    btnpod3.setClickable(false);
                    btnpod4.setClickable(false);
                    updateScore();
                }
            });
        }

        Log.v("AkhandBakar", "#########" + btnpod3.getText());
        if (btnpod3.getText().equals("")) {

            btnpod3.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Log.v("AkhandBakar", "#########" + player3);
                    if (player3.equals("CHOR")) {

                        RajaMantri.guess = true;
                        btnpod3.setBackgroundResource(R.drawable.podopen);
                        btnpod3.setText("CHOR");
                    } else {

                        RajaMantri.guess = false;
                        btnpod3.setBackgroundResource(R.drawable.podopen);
                        btnpod3.setText("SIPAHI");

                    }
                    btnpod1.setClickable(false);
                    btnpod2.setClickable(false);
                    btnpod3.setClickable(false);
                    btnpod4.setClickable(false);
                    updateScore();
                }
            });
        }


        Log.v("AkhandBakar", "#########" + btnpod4.getText());
        if (btnpod4.getText().equals("")) {

            btnpod4.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Log.v("AkhandBakar", "#########" + player4);
                    if (player4.equals("CHOR")) {

                        RajaMantri.guess = true;
                        btnpod4.setBackgroundResource(R.drawable.podopen);
                        btnpod4.setText("CHOR");
                    } else {

                        RajaMantri.guess = false;
                        btnpod4.setBackgroundResource(R.drawable.podopen);
                        btnpod4.setText("SIPAHI");

                    }
                    btnpod1.setClickable(false);
                    btnpod2.setClickable(false);
                    btnpod3.setClickable(false);
                    btnpod4.setClickable(false);
                    updateScore();
                }
            });
        }

    }

    public void shuffle() {

        btnplay.setText("Guess");
        btnplay.setClickable(false);
        shuffleArray(solutionarray);
        txtturn.setText(player1_name + "'s" + " turn!");
        nextturn = player2_name;
        btnpod1 = (Button) findViewById(R.id.btnpod1);
        btnpod1.setBackgroundResource(R.drawable.podtlclosed);
        btnpod1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                player1 = solutionarray[0];
                btnpod1.setText(player1);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setClickable(false);
                btnpod3.setClickable(false);
                btnpod4.setClickable(false);
                if (txtturn.getText().equals(player1_name + "'s" + " turn!")) {

                    if (player1.equals("MANTRI")) {

                        player1_role = "MANTRI";
                    }
                    if (player1.equals("RAJA")) {

                        player1_role = "RAJA";
                    }
                    if (player1.equals("SIPAHI")) {

                        player1_role = "SIPAHI";
                    }
                    if (player1.equals("CHOR")) {

                        player1_role = "CHOR";
                    }


                    nextturn = player2_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player2_name + "'s" + " turn!")) {

                    if (player1.equals("MANTRI")) {

                        player2_role = "MANTRI";
                    }
                    if (player1.equals("RAJA")) {

                        player2_role = "RAJA";
                    }
                    if (player1.equals("SIPAHI")) {

                        player2_role = "SIPAHI";
                    }
                    if (player1.equals("CHOR")) {

                        player2_role = "CHOR";
                    }

                    nextturn = player3_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player3_name + "'s" + " turn!")) {

                    if (player1.equals("MANTRI")) {

                        player3_role = "MANTRI";
                    }
                    if (player1.equals("RAJA")) {

                        player3_role = "RAJA";
                    }
                    if (player1.equals("SIPAHI")) {

                        player3_role = "SIPAHI";
                    }
                    if (player1.equals("CHOR")) {

                        player3_role = "CHOR";
                    }

                    nextturn = player4_name + "'s" + " turn!";

                }

                if (txtturn.getText().equals(player4_name + "'s" + " turn!")) {

                    if (player1.equals("MANTRI")) {

                        player4_role = "MANTRI";
                    }
                    if (player1.equals("RAJA")) {

                        player4_role = "RAJA";
                    }
                    if (player1.equals("SIPAHI")) {

                        player4_role = "SIPAHI";
                    }
                    if (player1.equals("CHOR")) {

                        player4_role = "CHOR";
                    }


                    nextturn = "Click on Guess!";

                }

                txtturn.setText("Click again to close the chit!");



                btnpod1.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        btnpod1.setClickable(false);
                        count++;
                        btnpod1.setText("");
                        btnpod1.setBackgroundResource(R.drawable.podtlhalf);
                        txtturn.setText(nextturn);
                        btnpod2.setClickable(true);
                        btnpod3.setClickable(true);
                        btnpod4.setClickable(true);
                        if (count == 4) {

                            txtturn.setText("Click on Guess!");
                            btnplay.setClickable(true);
                            count = 0;

                        }
                    }
                });
            }
        });

        btnpod2 = (Button) findViewById(R.id.btnpod2);
        btnpod2.setBackgroundResource(R.drawable.podtrclosed);
        btnpod2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                player2 = solutionarray[1];
                btnpod2.setText(player2);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod1.setClickable(false);
                btnpod3.setClickable(false);
                btnpod4.setClickable(false);
                if (txtturn.getText().equals(player1_name + "'s" + " turn!")) {

                    if (player2.equals("MANTRI")) {

                        player1_role = "MANTRI";
                    }
                    if (player2.equals("RAJA")) {

                        player1_role = "RAJA";
                    }
                    if (player2.equals("SIPAHI")) {

                        player1_role = "SIPAHI";
                    }
                    if (player2.equals("CHOR")) {

                        player1_role = "CHOR";
                    }

                    nextturn = player2_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player2_name + "'s" + " turn!")) {

                    if (player2.equals("MANTRI")) {

                        player2_role = "MANTRI";
                    }
                    if (player2.equals("RAJA")) {

                        player2_role = "RAJA";
                    }
                    if (player2.equals("SIPAHI")) {

                        player2_role = "SIPAHI";
                    }
                    if (player2.equals("CHOR")) {

                        player2_role = "CHOR";
                    }

                    nextturn = player3_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player3_name + "'s" + " turn!")) {

                    if (player2.equals("MANTRI")) {

                        player3_role = "MANTRI";
                    }
                    if (player2.equals("RAJA")) {

                        player3_role = "RAJA";
                    }
                    if (player2.equals("SIPAHI")) {

                        player3_role = "SIPAHI";
                    }
                    if (player2.equals("CHOR")) {

                        player3_role = "CHOR";
                    }

                    nextturn = player4_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player4_name + "'s" + " turn!")) {

                    if (player2.equals("MANTRI")) {

                        player4_role = "MANTRI";
                    }
                    if (player2.equals("RAJA")) {

                        player4_role = "RAJA";
                    }
                    if (player2.equals("SIPAHI")) {

                        player4_role = "SIPAHI";
                    }
                    if (player2.equals("CHOR")) {

                        player4_role = "CHOR";
                    }

                    nextturn = "Click on Guess!";

                }
                txtturn.setText("Click again to close the chit!");
                btnpod2.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        btnpod2.setClickable(false);
                        count++;
                        btnpod2.setText("");
                        btnpod2.setBackgroundResource(R.drawable.podtrhalf);
                        txtturn.setText(nextturn);
                        btnpod1.setClickable(true);
                        btnpod3.setClickable(true);
                        btnpod4.setClickable(true);
                        if (count == 4) {

                            txtturn.setText("Click on Guess!");
                            btnplay.setClickable(true);
                            count = 0;

                        }
                    }
                });
            }
        });


        btnpod3 = (Button) findViewById(R.id.btnpod3);
        btnpod3.setBackgroundResource(R.drawable.podblclosed);
        btnpod3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                player3 = solutionarray[2];
                btnpod3.setText(player3);
                btnpod3.setBackgroundResource(R.drawable.podopen);

                btnpod2.setClickable(false);
                btnpod1.setClickable(false);
                btnpod4.setClickable(false);
                if (txtturn.getText().equals(player1_name + "'s" + " turn!")) {

                    if (player3.equals("MANTRI")) {

                        player1_role = "MANTRI";
                    }
                    if (player3.equals("RAJA")) {

                        player1_role = "RAJA";
                    }
                    if (player3.equals("SIPAHI")) {

                        player1_role = "SIPAHI";
                    }
                    if (player3.equals("CHOR")) {

                        player1_role = "CHOR";
                    }

                    nextturn = player2_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player2_name + "'s" + " turn!")) {

                    if (player3.equals("MANTRI")) {

                        player2_role = "MANTRI";
                    }
                    if (player3.equals("RAJA")) {

                        player2_role = "RAJA";
                    }
                    if (player3.equals("SIPAHI")) {

                        player2_role = "SIPAHI";
                    }
                    if (player3.equals("CHOR")) {

                        player2_role = "CHOR";
                    }

                    nextturn = player3_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player3_name + "'s" + " turn!")) {

                    if (player3.equals("MANTRI")) {

                        player3_role = "MANTRI";
                    }
                    if (player3.equals("RAJA")) {

                        player3_role = "RAJA";
                    }
                    if (player3.equals("SIPAHI")) {

                        player3_role = "SIPAHI";
                    }
                    if (player3.equals("CHOR")) {

                        player3_role = "CHOR";
                    }
                    nextturn = player4_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player4_name + "'s" + " turn!")) {

                    if (player3.equals("MANTRI")) {

                        player4_role = "MANTRI";
                    }
                    if (player3.equals("RAJA")) {

                        player4_role = "RAJA";
                    }
                    if (player3.equals("SIPAHI")) {

                        player4_role = "SIPAHI";
                    }
                    if (player3.equals("CHOR")) {

                        player4_role = "CHOR";
                    }
                    nextturn = "Click on Guess!";

                }

                txtturn.setText("Click again to close the chit!");
                btnpod3.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        btnpod3.setClickable(false);
                        count++;
                        btnpod3.setText("");
                        btnpod3.setBackgroundResource(R.drawable.podblhalf);
                        txtturn.setText(nextturn);
                        btnpod2.setClickable(true);
                        btnpod1.setClickable(true);
                        btnpod4.setClickable(true);
                        if (count == 4) {

                            txtturn.setText("Click on Guess!");
                            btnplay.setClickable(true);
                            count = 0;

                        }
                    }
                });
            }
        });




        btnpod4 = (Button) findViewById(R.id.btnpod4);
        btnpod4.setBackgroundResource(R.drawable.podbrclosed);

        btnpod4.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                player4 = solutionarray[3];
                btnpod4.setText(player4);
                btnpod4.setBackgroundResource(R.drawable.podopen);


                btnpod2.setClickable(false);
                btnpod3.setClickable(false);
                btnpod1.setClickable(false);
                if (txtturn.getText().equals(player1_name + "'s" + " turn!")) {

                    if (player4.equals("MANTRI")) {

                        player1_role = "MANTRI";
                    }
                    if (player4.equals("RAJA")) {

                        player1_role = "RAJA";
                    }
                    if (player4.equals("SIPAHI")) {

                        player1_role = "SIPAHI";
                    }
                    if (player4.equals("CHOR")) {

                        player1_role = "CHOR";
                    }
                    nextturn = player2_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player2_name + "'s" + " turn!")) {

                    if (player4.equals("MANTRI")) {

                        player2_role = "MANTRI";
                    }
                    if (player4.equals("RAJA")) {

                        player2_role = "RAJA";
                    }
                    if (player4.equals("SIPAHI")) {

                        player2_role = "SIPAHI";
                    }
                    if (player4.equals("CHOR")) {

                        player2_role = "CHOR";
                    }
                    nextturn = player3_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player3_name + "'s" + " turn!")) {

                    if (player4.equals("MANTRI")) {

                        player3_role = "MANTRI";
                    }
                    if (player4.equals("RAJA")) {

                        player3_role = "RAJA";
                    }
                    if (player4.equals("SIPAHI")) {

                        player3_role = "SIPAHI";
                    }
                    if (player4.equals("CHOR")) {

                        player3_role = "CHOR";
                    }
                    nextturn = player4_name + "'s" + " turn!";

                }
                if (txtturn.getText().equals(player4_name + "'s" + " turn!")) {

                    if (player4.equals("MANTRI")) {

                        player4_role = "MANTRI";
                    }
                    if (player4.equals("RAJA")) {

                        player4_role = "RAJA";
                    }
                    if (player4.equals("SIPAHI")) {

                        player4_role = "SIPAHI";
                    }
                    if (player4.equals("CHOR")) {

                        player4_role = "CHOR";
                    }
                    nextturn = "Click on Guess!";

                }

                txtturn.setText("Click again to close the chit!");
                btnpod4.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        btnpod4.setClickable(false);
                        count++;
                        btnpod4.setText("");
                        btnpod4.setBackgroundResource(R.drawable.podbrhalf);
                        txtturn.setText(nextturn);
                        btnpod2.setClickable(true);
                        btnpod3.setClickable(true);
                        btnpod1.setClickable(true);
                        if (count == 4) {

                            txtturn.setText(nextturn);
                            btnplay.setClickable(true);
                            count = 0;

                        }
                    }
                });
            }
        });

        btnpod1.setText("");
        btnpod2.setText("");
        btnpod3.setText("");
        btnpod4.setText("");


    }

    public void setRole(String role, String player) {

        if (player1.equals("MANTRI")) {

            player4_role = "MANTRI";
        }
        if (player1.equals("RAJA")) {

            player4_role = "RAJA";
        }
        if (player1.equals("SIPAHI")) {

            player4_role = "SIPAHI";
        }
        if (player1.equals("CHOR")) {

            player4_role = "CHOR";
        }


    }

    void shuffleArray(String[] solutionarray) {
        Random rnd = new Random();
        for (int i = solutionarray.length - 1; i >= 0; i--) {
            int index = rnd.nextInt(i + 1);

            String a = solutionarray[index];
            solutionarray[index] = solutionarray[i];
            solutionarray[i] = a;
        }
    }

    static void updateScore() {

        Log.v("AkhandBakar", "##########" + guess);
        if (player1_role.equals("MANTRI")) {
            Log.v("AkhandBakar", "##########Mantri" + player1_name);
            if (guess) {
                i = i + 80;
                p1score = i;
                txtturn.setText(player1_name + " is right!");
                btnpod1.setText(player1);
                btnpod2.setText(player2);
                btnpod3.setText(player3);
                btnpod4.setText(player4);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod3.setBackgroundResource(R.drawable.podopen);
                btnpod4.setBackgroundResource(R.drawable.podopen);
                if (player2_role.equals("CHOR")) {
                    p2score = j;
                    if (player3_role.equals("RAJA")) {

                        k = k + 100;
                        l = l + 50;
                        p3score = k;
                        p4score = l;
                    } else {

                        l = l + 100;
                        k = k + 50;
                        p4score = l;
                        p3score = k;
                    }
                }
                if (player3_role.equals("CHOR")) {

                    p3score = k;


                    if (player2_role.equals("RAJA")) {

                        j = j + 100;
                        l = l + 50;
                        p2score = j;
                        p4score = l;
                    } else {

                        l = l + 100;
                        j = j + 50;
                        p4score = l;
                        p2score = j;
                    }
                }
                if (player4_role.equals("CHOR")) {

                    p4score = l;

                    if (player3_role.equals("RAJA")) {

                        k = k + 100;
                        j = j + 50;
                        p2score = j;
                        p3score = k;
                    } else {

                        j = j + 100;
                        k = k + 50;
                        p3score = k;
                        p2score = j;
                    }
                }
            } else {
                i = i - 80;
                p1score = i;
                txtturn.setText(player1_name + " is wrong!");
                btnpod1.setText(player1);
                btnpod2.setText(player2);
                btnpod3.setText(player3);
                btnpod4.setText(player4);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod3.setBackgroundResource(R.drawable.podopen);
                btnpod4.setBackgroundResource(R.drawable.podopen);
                if (player2_role.equals("CHOR")) {
                    j = j + 25;
                    p2score = j;
                    if (player3_role.equals("RAJA")) {

                        k = k + 100;
                        l = l + 50;
                        p3score = k;
                        p4score = l;
                    } else {

                        l = l + 100;
                        k = k + 50;
                        p4score = l;
                        p3score = k;
                    }
                }
                if (player3_role.equals("CHOR")) {
                    k = k + 25;
                    p3score = k;


                    if (player2_role.equals("RAJA")) {

                        j = j + 100;
                        l = l + 50;
                        p2score = j;
                        p4score = l;
                    } else {

                        l = l + 100;
                        j = j + 50;
                        p4score = l;
                        p2score = j;
                    }
                }
                if (player4_role.equals("CHOR")) {
                    l = l + 25;
                    p4score = l;

                    if (player3_role.equals("RAJA")) {

                        k = k + 100;
                        j = j + 50;
                        p2score = j;
                        p3score = k;
                    } else {

                        j = j + 100;
                        k = k + 50;
                        p3score = k;
                        p2score = j;
                    }
                }
            }

        }
        if (player2_role.equals("MANTRI")) {
            if (guess) {
                Log.v("AkhandBakar", "##########Mantri" + player2_name);
                j = j + 80;
                p2score = j;
                txtturn.setText(player2_name + " is right!");
                btnpod1.setText(player1);
                btnpod2.setText(player2);
                btnpod3.setText(player3);
                btnpod4.setText(player4);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod3.setBackgroundResource(R.drawable.podopen);
                btnpod4.setBackgroundResource(R.drawable.podopen);
                if (player1_role.equals("CHOR")) {
                    p1score = i;

                    if (player3_role.equals("RAJA")) {

                        k = k + 100;
                        l = l + 50;
                        p3score = k;
                        p4score = l;

                    } else {

                        l = l + 100;
                        k = k + 50;
                        p4score = l;
                        p3score = k;
                    }

                }
                if (player3_role.equals("CHOR")) {

                    p3score = k;


                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        l = l + 50;
                        p1score = i;
                        p4score = l;

                    } else {

                        l = l + 100;
                        i = i + 50;
                        p1score = i;
                        p4score = l;

                    }

                }
                if (player4_role.equals("CHOR")) {

                    p4score = l;

                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        k = k + 50;
                        p1score = i;
                        p3score = k;

                    } else {

                        k = k + 100;
                        i = i + 50;
                        p1score = i;
                        p3score = k;


                    }


                }
            } else {

                j = j - 80;
                p2score = j;
                txtturn.setText(player2_name + " is wrong!");
                btnpod1.setText(player1);
                btnpod2.setText(player2);
                btnpod3.setText(player3);
                btnpod4.setText(player4);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod3.setBackgroundResource(R.drawable.podopen);
                btnpod4.setBackgroundResource(R.drawable.podopen);
                if (player1_role.equals("CHOR")) {
                    i = i + 25;
                    p1score = i;

                    if (player3_role.equals("RAJA")) {

                        k = k + 100;
                        l = l + 50;
                        p3score = k;
                        p4score = l;

                    } else {

                        l = l + 100;
                        k = k + 50;
                        p4score = l;
                        p3score = k;
                    }

                }
                if (player3_role.equals("CHOR")) {
                    k = k + 25;
                    p3score = k;


                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        l = l + 50;
                        p1score = i;
                        p4score = l;

                    } else {

                        l = l + 100;
                        i = i + 50;
                        p1score = i;
                        p4score = l;

                    }

                }
                if (player4_role.equals("CHOR")) {
                    l = l + 25;
                    p4score = l;

                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        k = k + 50;
                        p1score = i;
                        p3score = k;

                    } else {

                        k = k + 100;
                        i = i + 50;
                        p1score = i;
                        p3score = k;


                    }


                }
            }

        }
        if (player3_role.equals("MANTRI")) {
            Log.v("AkhandBakar", "##########Mantri" + player3_name);
            if (guess) {
                k = k + 80;
                p3score = k;
                txtturn.setText(player3_name + " is right!");
                btnpod1.setText(player1);
                btnpod2.setText(player2);
                btnpod3.setText(player3);
                btnpod4.setText(player4);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod3.setBackgroundResource(R.drawable.podopen);
                btnpod4.setBackgroundResource(R.drawable.podopen);
                if (player1_role.equals("CHOR")) {
                    p1score = i;

                    if (player2_role.equals("RAJA")) {

                        j = j + 100;
                        l = l + 50;
                        p2score = j;
                        p4score = l;


                    } else {

                        l = l + 100;
                        j = j + 50;
                        p2score = j;
                        p4score = l;


                    }

                }
                if (player2_role.equals("CHOR")) {

                    p2score = j;


                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        l = l + 50;
                        p1score = i;
                        p4score = l;

                    } else {

                        i = i + 50;
                        l = l + 100;
                        p1score = i;
                        p4score = l;

                    }

                }
                if (player4_role.equals("CHOR")) {

                    p4score = l;

                    if (player2_role.equals("RAJA")) {

                        j = j + 100;
                        i = i + 50;
                        p1score = i;
                        p2score = j;

                    } else {

                        j = j + 50;
                        i = i + 100;
                        p1score = i;
                        p2score = j;

                    }


                }
            } else {
                k = k - 80;
                p3score = k;
                txtturn.setText(player3_name + " is wrong!");
                btnpod1.setText(player1);
                btnpod2.setText(player2);
                btnpod3.setText(player3);
                btnpod4.setText(player4);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod3.setBackgroundResource(R.drawable.podopen);
                btnpod4.setBackgroundResource(R.drawable.podopen);
                if (player1_role.equals("CHOR")) {
                    i = i + 25;
                    p1score = i;

                    if (player2_role.equals("RAJA")) {

                        j = j + 100;
                        l = l + 50;
                        p2score = j;
                        p4score = l;


                    } else {

                        l = l + 100;
                        j = j + 50;
                        p2score = j;
                        p4score = l;


                    }

                }
                if (player2_role.equals("CHOR")) {
                    j = j + 25;
                    p2score = j;


                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        l = l + 50;
                        p1score = i;
                        p4score = l;

                    } else {

                        i = i + 50;
                        l = l + 100;
                        p1score = i;
                        p4score = l;

                    }

                }
                if (player4_role.equals("CHOR")) {
                    l = l + 25;
                    p4score = l;

                    if (player2_role.equals("RAJA")) {

                        j = j + 100;
                        i = i + 50;
                        p1score = i;
                        p2score = j;

                    } else {

                        j = j + 50;
                        i = i + 100;
                        p1score = i;
                        p2score = j;

                    }


                }
            }

        }
        if (player4_role.equals("MANTRI")) {
            Log.v("AkhandBakar", "##########Mantri" + player4_name);
            if (guess) {
                l = l + 80;
                p4score = l;
                txtturn.setText(player4_name + " is right!");
                btnpod1.setText(player1);
                btnpod2.setText(player2);
                btnpod3.setText(player3);
                btnpod4.setText(player4);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod3.setBackgroundResource(R.drawable.podopen);
                btnpod4.setBackgroundResource(R.drawable.podopen);
                if (player1_role.equals("CHOR")) {
                    p1score = i;


                    if (player2_role.equals("RAJA")) {

                        j = j + 100;
                        k = k + 50;
                        p2score = j;
                        p3score = k;

                    } else {

                        j = j + 50;
                        k = k + 100;
                        p2score = j;
                        p3score = k;

                    }
                }
                if (player2_role.equals("CHOR")) {

                    p2score = j;


                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        k = k + 50;
                        p1score = i;
                        p3score = k;
                    } else {

                        i = i + 50;
                        k = k + 100;
                        p1score = i;
                        p3score = k;

                    }

                }
                if (player3_role.equals("CHOR")) {

                    p3score = k;

                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        j = j + 50;
                        p1score = i;
                        p2score = j;
                    } else {

                        i = i + 50;
                        j = j + 100;
                        p1score = i;
                        p2score = j;

                    }


                }
            } else {
                l = l - 80;
                p4score = l;
                txtturn.setText(player4_name + " is wrong!");
                btnpod1.setText(player1);
                btnpod2.setText(player2);
                btnpod3.setText(player3);
                btnpod4.setText(player4);
                btnpod1.setBackgroundResource(R.drawable.podopen);
                btnpod2.setBackgroundResource(R.drawable.podopen);
                btnpod3.setBackgroundResource(R.drawable.podopen);
                btnpod4.setBackgroundResource(R.drawable.podopen);
                if (player1_role.equals("CHOR")) {
                    i = i + 25;
                    p1score = i;


                    if (player2_role.equals("RAJA")) {

                        j = j + 100;
                        k = k + 50;
                        p2score = j;
                        p3score = k;

                    } else {

                        j = j + 50;
                        k = k + 100;
                        p2score = j;
                        p3score = k;

                    }
                }
                if (player2_role.equals("CHOR")) {
                    j = j + 25;
                    p2score = j;


                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        k = k + 50;
                        p1score = i;
                        p3score = k;
                    } else {

                        i = i + 50;
                        k = k + 100;
                        p1score = i;
                        p3score = k;

                    }

                }
                if (player3_role.equals("CHOR")) {
                    k = k + 25;
                    p3score = k;

                    if (player1_role.equals("RAJA")) {

                        i = i + 100;
                        j = j + 50;
                        p1score = i;
                        p2score = j;
                    } else {

                        i = i + 50;
                        j = j + 100;
                        p1score = i;
                        p2score = j;

                    }


                }
            }

        }


        Log.v("AkhandBakar", "##########Score " + i);
        txtplayer1.setText("1." + player1_name + " [" + i + "]");
        Log.v("AkhandBakar", player1 + " [" + i + "]");

        txtplayer2.setText("2." + player2_name + " [" + j + "]");

        Log.v("AkhandBakar", player2 + " [" + p2score + "]");

        txtplayer3.setText("3." + player3_name + " [" + k + "]");
        Log.v("AkhandBakar", player3 + " [" + p3score + "]");

        txtplayer4.setText("4." + player4_name + " [" + l + "]");
        Log.v("AkhandBakar", player4 + " [" + p4score + "]");
    }
}
