/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package elomelo;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Farhan_Arnob
 */
public class LuduOnGui extends Application {
	Random rn = new Random();
	int[] getNumber=new int[3];
	int[] getNumber2=new int[3];
	int[] player2=new  int[4];
	int[] player1=new  int[4];
	int r=1;
	int win=0;
	int rx=70,ry=660,bx=123,by=660,gx=175,gy=660,cx=225,cy=660;
	int ox=420,oy=143,tx=470,ty=143,thx=520,thy=143,fx=570,fy=143;
	Text t = new Text (75, 40, "CLICK TURN BUTTON TO PLAY");
	Text t2 = new Text (75, 100, "");
	int comeOut=0;
	int box=0;
    @Override
    public void start(Stage primaryStage) {
    	player2[0]=0;
    	player2[1]=0;
    	player2[2]=0;
    	player2[3]=0;
    	player1[0]=0;
    	player1[1]=0;
    	player1[2]=0;
    	player1[3]=0;
    	
    	ImageView img = new ImageView();
    	Image im = new Image("file:src/dsdf.png");
    	img.setImage(im);
        Button turn = new Button("Turn");
        turn.setLayoutX(50);
        turn.setLayoutY(550);
        Button unbox = new Button("Unbox");
        unbox.setLayoutX(125);
        unbox.setLayoutY(550);
        unbox.setOnAction(e -> {
                System.out.println("Unbox");
        });
        Button eat = new Button("Eat");
        eat.setLayoutX(212);
        eat.setLayoutY(550);
        eat.setOnAction(e -> {
                System.out.println("eat");
        });
        Button red = new Button("Red");
        red.setLayoutX(50);
        red.setLayoutY(590);
        red.setOnAction(e -> {
                System.out.println("red");
        });
        Button blue = new Button("Blue");
        blue.setLayoutX(94);
        blue.setLayoutY(590);
        blue.setOnAction(e -> {
                System.out.println("blue");
        });
        Button green = new Button("Green");
        green.setLayoutX(140);
        green.setLayoutY(590);
        green.setOnAction(e -> {
                System.out.println("green");
        });
        Button chocolate = new Button("Chocolate");
        chocolate.setLayoutX(194);
        chocolate.setLayoutY(590);
        chocolate.setOnAction(e -> {
                System.out.println("chocolate");
        });
        Circle rCircle = new Circle();
        rCircle.setCenterX(rx);
        rCircle.setCenterY(ry);
        rCircle.setRadius(15.0f);
        rCircle.setFill(Color.RED);
        
        Circle bCircle = new Circle();
        bCircle.setCenterX(bx);
        bCircle.setCenterY(by);
        bCircle.setRadius(15.0f);
        bCircle.setFill(Color.BLUE);
        
        Circle gCircle = new Circle();
        gCircle.setCenterX(gx);
        gCircle.setCenterY(gy);
        gCircle.setRadius(15.0f);
        gCircle.setFill(Color.GREEN);
        
        Circle cCircle = new Circle();
        cCircle.setCenterX(cx);
        cCircle.setCenterY(cy);
        cCircle.setRadius(15.0f);
        cCircle.setFill(Color.CHOCOLATE);
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Circle One=new Circle();
        One.setCenterX(ox);
        One.setCenterY(oy);
        One.setRadius(15.0f);
        One.setFill(Color.BROWN);
        
        Circle Two=new Circle();
        Two.setCenterX(tx);
        Two.setCenterY(ty);
        Two.setRadius(15.0f);
        Two.setFill(Color.DARKCYAN);
        
        Circle Three=new Circle();
        Three.setCenterX(thx);
        Three.setCenterY(thy);
        Three.setRadius(15.0f);
        Three.setFill(Color.GREY);
        
        Circle Four=new Circle();
        Four.setCenterX(fx);
        Four.setCenterY(fy);
        Four.setRadius(15.0f);
        Four.setFill(Color.DEEPPINK);
        if(r==1){
            turn.setOnAction(e -> {
            		int flag=1;
                    System.out.println("Turn");
                   if(getNumber[0]==0 && getNumber[1]==0 && getNumber[2]==0){
                    do{		
    					for(int i=0;i<3;i++){
    						getNumber[i]=6-rn.nextInt(6);
    						if(
    								getNumber[2]==6){
    								getNumber[0]=0;
    								getNumber[1]=0;
    								getNumber[2]=0;
    								i=-1;
    						}
    						else if(getNumber[i]!=6){
    								flag=0;
    								break;
    						}
    					}
    				}while(flag==1);
                    t.setFont(new Font(16));
                    t.setText("YOUR FIRST TURN IS : "+getNumber[0]+"\n"+"YOUR SECOND TURN IS : "+getNumber[1]+"\n"+"YOUR THIRD TURN IS : "+getNumber[2]);
                    if(player2[0]==2 && player2[1]==2 && player2[2]==2 && player2[3]==2){
           				win=2;
           				t2.setText("");
           				t.setText("You Win");
           			}
                    if((getNumber[0]==6 || getNumber[1]==6 )){
                    // loop = checking 4 coins in box
            		//getNumber = input number
                    	int k=0;
            		for(int i=0;i<3 && k==0;i++){
            			if (getNumber[i]==6){   
            					    	  String color="";
            					    	  t.setFont(new Font(16));
            					    	  	if( rx==70 && ry==660){
            					    	  		color="RED";
            					    	  		comeOut=1;
            					    	  		box=i;
            					    	  	}
            					    	  	else if(bx==123 && by==660){
            					    	  		color="BLUE";
            					    	  		comeOut=2;
            					    	  		box=i;
            					    	  	}
            					    	  	else if(gx==175 && gy==660){
            					    	  		color="GREEN";
            					    	  		comeOut=3;
            					    	  		box=i;
            					    	  	}
            					    	  	else if(cx==225 && cy==660){
            					    	  		color="CHOCOLATE";
            					    	  		comeOut=4;
            					    	  		box=i;
            					    	  		
            					    	  	}
            					    	  	System.out.println("comeOut "+comeOut);
            					    	 t2.setFont(new Font(16));
            					    	 t2.setFill(Color.RED);
            					    	 if(comeOut==1)
            					    	  		t2.setText("UNBOX : "+color+" COLOR COIN");
            					    	 else if(comeOut==2)
         					    	  		t2.setText("UNBOX : "+color+" COLOR COIN");
            					    	 else if(comeOut==3)
         					    	  		t2.setText("UNBOX : "+color+" COLOR COIN");
            					    	 else if(comeOut==4)
         					    	  		t2.setText("UNBOX : "+color+" COLOR COIN");
            					    	 unbox.setOnAction(f ->{
            					    	     if(comeOut==1 && rx==70 && ry==660){
    		        					    		 rx=300;
    		        					    		 ry=600;
    			        						     getNumber[box]=0;
    			        						     comeOut=0;
    			        						     rCircle.setCenterX(rx);
    			        						     rCircle.setCenterY(ry);
    			        						     player2[0]=1;
    			        						     if(getNumber[0]!=0 || getNumber[1]!=0 || getNumber[2]!=0){
    			        						    	 t2.setText("PLAY OUTER BOX COIN");
    			        						     }
    			        						     else
    			        						    	 t2.setText("");
    			        						     t.setText("YOUR FIRST TURN IS : "+getNumber[0]+"\n"+"YOUR SECOND TURN IS : "+getNumber[1]+"\n"+"YOUR THIRD TURN IS : "+getNumber[2]);
            					    			 }
            					    		 else if(comeOut==2 && bx==123 && by==660){
    	                					    		 bx=300;
    	                					    		 by=600;
    	        	        						     getNumber[box]=0;
    	        	        						     comeOut=0;
    	        	        						     bCircle.setCenterX(bx);
    	        	        						     bCircle.setCenterY(by);
    	        	        						     player2[1]=1;
    	        	        						     if(getNumber[0]!=0 || getNumber[1]!=0 || getNumber[2]!=0){
    	        	        						    	 t2.setText("PLAY OUTER BOX COIN");
    	        	        						     }
    	        	        						     else
    	        	        						    	 t2.setText("");
    	        	        						     t.setText("YOUR FIRST TURN IS : "+getNumber[0]+"\n"+"YOUR SECOND TURN IS : "+getNumber[1]+"\n"+"YOUR THIRD TURN IS : "+getNumber[2]);
                    					    			 }
            					    		 else if(comeOut==3 && gx==175 && gy==660){
    	                					    		 gx=300;
    	                					    		 gy=600;
    	        	        						     getNumber[box]=0;
    	        	        						     comeOut=0;
    	        	        						     gCircle.setCenterX(gx);
    	        	        						     gCircle.setCenterY(gy);
    	        	        						     player2[2]=1;
    	        	        						     if(getNumber[0]!=0 || getNumber[1]!=0 || getNumber[2]!=0){
    	        	        						    	 t2.setText("PLAY OUTER BOX COIN");
    	        	        						     }
    	        	        						     else
    	        	        						    	 t2.setText("");
    	        	        						     t.setText("YOUR FIRST TURN IS : "+getNumber[0]+"\n"+"YOUR SECOND TURN IS : "+getNumber[1]+"\n"+"YOUR THIRD TURN IS : "+getNumber[2]);
                    					    			 }
            					    		 else if(comeOut==4 && cx==225 && cy==660){
    	                					    		 cx=300;
    	                					    		 cy=600;
    	        	        						     getNumber[box]=0;
    	        	        						     comeOut=0;
    	        	        						     cCircle.setCenterX(cx);
    	        	        						     cCircle.setCenterY(cy);
    	        	        						     player2[3]=1;
    	        	        						     if(getNumber[0]!=0 || getNumber[1]!=0 || getNumber[2]!=0){
    	        	        						    	 t2.setText("PLAY OUTER BOX COIN");
    	        	        						     }
    	        	        						     else
    	        	        						    	 t2.setText("");
    	        	        						     t.setText("YOUR FIRST TURN IS : "+getNumber[0]+"\n"+"YOUR SECOND TURN IS : "+getNumber[1]+"\n"+"YOUR THIRD TURN IS : "+getNumber[2]);
                    					    			 }
            					    		 });
     
            					    	
            		}
            		}
            		
                    }	
                    if((player2[0]==0||player2[0]==2) && (player2[1]==0||player2[1]==2) && (player2[2]==0 || player2[2]==2) && (player2[3]==0||player2[3]==2) && getNumber[0]!=6 &&getNumber[1]!=6){
                     	t.setText("YOUR FIRST TURN IS : "+getNumber[0]+"\n"+"YOUR SECOND TURN IS : "+getNumber[1]+"\n"+"YOUR THIRD TURN IS : "+getNumber[2]+"\nNO 6. TRY AGAIN .");   
                    	getNumber[0]=0;
                    	getNumber[1]=0;
                    	getNumber[2]=0;
                    	r=0;
                    }
            			red.setOnAction(a ->{
            				System.out.println("come");
            				if(rx!=70 && ry!=660) {
            				if(rx!=335 || ry!=425){
            					System.out.println("Go");
    	        				int x=getNumber[0]+getNumber[1]+getNumber[2];
    	        				System.out.println(x);
    	        				while(rx==300 && ry>460 && x!=0){
    	        					ry = ry-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				if(rx==300 && ry==460 && x!=0){
    	        					rx = rx-35;
    	        					ry = ry-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx >90 && ry==425 && rx<300 && x!=0){
    	        					rx =rx-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx==90 && ry>355 && x!=0){
    	        					ry =ry-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx<265 && ry==355 && x!=0){
    	        					rx =rx+35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				if(rx==265 && ry==355 && x!=0){
    	        					rx =rx+35;
    	        					ry =ry-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx==300 && ry>145 && ry<355 && x!=0){
    	        					ry=ry-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx<370 && ry ==145 && x!=0){
    	        					rx = rx+35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx==370 && ry<320 && x!=0){
    	        					ry = ry+35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				if(rx==370 && ry==320 && x!=0){
    	        					rx =rx+35;
    	        					ry=ry+35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx>355 && rx<580 && ry==355 && x!=0){
    	        					rx =rx+35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx==580 && ry<425 && x!=0){
    	        					ry =ry+35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx>405 && ry==425 && x!=0){
    	        					rx =rx-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				if(rx==405 && ry==425 && x!=0){
    	        					rx=rx-35;
    	        					ry=ry+35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx==370 && ry<635 && x!=0){
    	        					ry=ry+35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				if(rx==370 && ry==635 && x!=0){
    	        					rx=rx-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				while(rx==335 && ry>425 && x!=0){
    	        					ry=ry-35;
    	        					x--;
    	        					System.out.println(rx+" ::"+ry);
    	        				}
    	        				if(rx==335 && ry==425){
    	        					player2[0]=2;
    	        				}
    	        				if((rx==ox && ry==oy)){
    	        					ox=420;
    	        					oy=143;
    	        					player1[0]=0;
    	        					One.setCenterX(ox);
    	           			        One.setCenterY(oy);
    	        				}
    	        				else if((rx==tx && ry==ty)){
    	        					tx=470;
    	        					ty=143;
    	        					player1[1]=0;
    	        					Two.setCenterX(tx);
    	           			        Two.setCenterY(ty);
    	        				}
    	        				else if((rx==thx && ry==thy)){
    	        					thx=520;
    	        					thy=143;
    	        					player1[2]=0;
    	        					Three.setCenterX(thx);
    	           			        Three.setCenterY(thy);
    	        				}
    	        				else if((rx==fx && ry==fy)){
    	        					fx=570;
    	        					fy=143;
    	        					player1[3]=0;
    	        					Four.setCenterX(fx);
    	           			        Four.setCenterY(fy);
    	        				}
            				getNumber[0]=0;
            				getNumber[1]=0;
            				getNumber[2]=0;
            				r=0;
            				rCircle.setCenterX(rx);
    					    rCircle.setCenterY(ry);
    					    t.setText("CLICK TURN BUTTON TO PLAY");
            				t2.setText("");
    					    System.out.println("turn finished");
            				}
            				}
            			});
            			blue.setOnAction(a ->{
            				System.out.println("come");
            				if(bx!=123 && by!=660){
            						if(bx!=335 || by!=425){
            					System.out.println("Go");
    	        				int x=getNumber[0]+getNumber[1]+getNumber[2];
    	        				System.out.println(x);
    	        				while(bx==300 && by>460 && x!=0){
    	        					by = by-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				if(bx==300 && by==460 && x!=0){
    	        					bx = bx-35;
    	        					by = by-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx >90 && by==425 && bx<300 && x!=0){
    	        					bx =bx-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx==90 && by>355 && x!=0){
    	        					by =by-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx<265 && by==355 && x!=0){
    	        					bx =bx+35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				if(bx==265 && by==355 && x!=0){
    	        					bx =bx+35;
    	        					by =by-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx==300 && by>145 && by<355 && x!=0){
    	        					by=by-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx<370 && by ==145 && x!=0){
    	        					bx = bx+35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx==370 && by<320 && x!=0){
    	        					by = by+35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				if(bx==370 && by==320 && x!=0){
    	        					bx =bx+35;
    	        					by=by+35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx>355 && bx<580 && by==355 && x!=0){
    	        					bx =bx+35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx==580 && by<425 && x!=0){
    	        					by =by+35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx>405 && by==425 && x!=0){
    	        					bx =bx-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				if(bx==405 && by==425 && x!=0){
    	        					bx=bx-35;
    	        					by=by+35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx==370 && by<635 && x!=0){
    	        					by=by+35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				if(bx==370 && by==635 && x!=0){
    	        					bx=bx-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				while(bx==335 && by>425 && x!=0){
    	        					by=by-35;
    	        					x--;
    	        					System.out.println(bx+" ::"+by);
    	        				}
    	        				if(bx==335 && by==425){
    	        					player2[1]=2;
    	        				}
    	        				if((bx==ox && by==oy)){
    	        					ox=420;
    	        					oy=143;
    	        					player1[0]=0;
    	        					One.setCenterX(ox);
    	           			        One.setCenterY(oy);
    	        				}
    	        				else if((bx==tx && by==ty)){
    	        					tx=470;
    	        					ty=143;
    	        					player1[1]=0;
    	        					Two.setCenterX(tx);
    	           			        Two.setCenterY(ty);
    	        				}
    	        				else if((bx==thx && by==thy)){
    	        					thx=520;
    	        					thy=143;
    	        					player1[2]=0;
    	        					Three.setCenterX(thx);
    	           			        Three.setCenterY(thy);
    	        				}
    	        				else if((bx==fx && by==fy)){
    	        					fx=570;
    	        					fy=143;
    	        					player1[3]=0;
    	        					Four.setCenterX(fx);
    	           			        Four.setCenterY(fy);
    	        				}
            				getNumber[0]=0;
            				getNumber[1]=0;
            				getNumber[2]=0;
            				r=0;
            				bCircle.setCenterX(bx);
    					    bCircle.setCenterY(by);
    					    t.setText("CLICK TURN BUTTON TO PLAY");
            				t2.setText("");
    					    System.out.println("turn finished");
            				}
            				}
            				});
            			green.setOnAction(a ->{
            				System.out.println("come");
            				if(gx!=175 && gy!=660){	
            				if(gx!=335 || gy!=425){
            					System.out.println("Go");
    	        				int x=getNumber[0]+getNumber[1]+getNumber[2];
    	        				System.out.println(x);
    	        				while(gx==300 && gy>460 && x!=0){
    	        					gy = gy-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				if(gx==300 && gy==460 && x!=0){
    	        					gx = gx-35;
    	        					gy = gy-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx >90 && gy==425 && gx<300 && x!=0){
    	        					gx =gx-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx==90 && gy>355 && x!=0){
    	        					gy =gy-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx<265 && gy==355 && x!=0){
    	        					gx =gx+35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				if(gx==265 && gy==355 && x!=0){
    	        					gx =gx+35;
    	        					gy =gy-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx==300 && gy>145 && gy<355 && x!=0){
    	        					gy=gy-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx<370 && gy ==145 && x!=0){
    	        					gx = gx+35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx==370 && gy<320 && x!=0){
    	        					gy = gy+35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				if(gx==370 && gy==320 && x!=0){
    	        					gx =gx+35;
    	        					gy=gy+35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx>355 && gx<580 && gy==355 && x!=0){
    	        					gx =gx+35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx==580 && gy<425 && x!=0){
    	        					gy =gy+35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx>405 && gy==425 && x!=0){
    	        					gx =gx-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				if(gx==405 && gy==425 && x!=0){
    	        					gx=gx-35;
    	        					gy=gy+35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx==370 && gy<635 && x!=0){
    	        					gy=gy+35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				if(gx==370 && gy==635 && x!=0){
    	        					gx=gx-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				while(gx==335 && gy>425 && x!=0){
    	        					gy=gy-35;
    	        					x--;
    	        					System.out.println(gx+" ::"+gy);
    	        				}
    	        				if(gx==335 && gy==425){
    	        					player2[2]=2;
    	        				}
    	        				if((gx==ox && gy==oy)){
    	        					ox=420;
    	        					oy=143;
    	        					player1[0]=0;
    	        					One.setCenterX(ox);
    	           			        One.setCenterY(oy);
    	        				}
    	        				else if((gx==tx && gy==ty)){
    	        					tx=470;
    	        					ty=143;
    	        					player1[1]=0;
    	        					Two.setCenterX(tx);
    	           			        Two.setCenterY(ty);
    	        				}
    	        				else if((gx==thx && gy==thy)){
    	        					thx=520;
    	        					thy=143;
    	        					player1[2]=0;
    	        					Three.setCenterX(thx);
    	           			        Three.setCenterY(thy);
    	        				}
    	        				else if((gx==fx && gy==fy)){
    	        					fx=570;
    	        					fy=143;
    	        					player1[3]=0;
    	        					Four.setCenterX(fx);
    	           			        Four.setCenterY(fy);
    	        				}
            				getNumber[0]=0;
            				getNumber[1]=0;
            				getNumber[2]=0;
            				r=0;
            				gCircle.setCenterX(gx);
    					    gCircle.setCenterY(gy);
    					    t.setText("CLICK TURN BUTTON TO PLAY");
            				t2.setText("");
    					    System.out.println("turn finished");
            				}
            				}
            				});
            			chocolate.setOnAction(a ->{
            				System.out.println("come");
            				if(cx!=225 && cy!=660){
            						if(cx!=335 || cy!=425){
            					System.out.println("Go");
    	        				int x=getNumber[0]+getNumber[1]+getNumber[2];
    	        				System.out.println(x);
    	        				while(cx==300 && cy>460 && x!=0){
    	        					cy = cy-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				if(cx==300 && cy==460 && x!=0){
    	        					cx = cx-35;
    	        					cy = cy-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx >90 && cy==425 && cx<300 && x!=0){
    	        					cx =cx-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx==90 && cy>355 && x!=0){
    	        					cy =cy-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx<265 && cy==355 && x!=0){
    	        					cx =cx+35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				if(cx==265 && cy==355 && x!=0){
    	        					cx =cx+35;
    	        					cy =cy-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx==300 && cy>145 && cy<355 && x!=0){
    	        					cy=cy-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx<370 && cy ==145 && x!=0){
    	        					cx = cx+35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx==370 && cy<320 && x!=0){
    	        					cy = cy+35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				if(cx==370 && cy==320 && x!=0){
    	        					cx =cx+35;
    	        					cy=cy+35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx>355 && cx<580 && cy==355 && x!=0){
    	        					cx =cx+35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx==580 && cy<425 && x!=0){
    	        					cy =cy+35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx>405 && cy==425 && x!=0){
    	        					cx =cx-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				if(cx==405 && cy==425 && x!=0){
    	        					cx=cx-35;
    	        					cy=cy+35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx==370 && cy<635 && x!=0){
    	        					cy=cy+35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				if(cx==370 && cy==635 && x!=0){
    	        					cx=cx-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				while(cx==335 && cy>425 && x!=0){
    	        					cy=cy-35;
    	        					x--;
    	        					System.out.println(cx+" ::"+cy);
    	        				}
    	        				if(cx==335 && cy==425){
    	        					player2[3]=2;
    	        				}
    	        				if((cx==ox && cy==oy)){
    	        					ox=420;
    	        					oy=143;
    	        					player1[0]=0;
    	        					One.setCenterX(ox);
    	           			        One.setCenterY(oy);
    	        				}
    	        				else if((cx==tx && cy==ty)){
    	        					tx=470;
    	        					ty=143;
    	        					player1[1]=0;
    	        					Two.setCenterX(tx);
    	           			        Two.setCenterY(ty);
    	        				}
    	        				else if((cx==thx && cy==thy)){
    	        					thx=520;
    	        					thy=143;
    	        					player1[2]=0;
    	        					Three.setCenterX(thx);
    	           			        Three.setCenterY(thy);
    	        				}
    	        				else if((cx==fx && cy==fy)){
    	        					fx=570;
    	        					fy=143;
    	        					player1[3]=0;
    	        					Four.setCenterX(fx);
    	           			        Four.setCenterY(fy);
    	        				}
            				getNumber[0]=0;
            				getNumber[1]=0;
            				getNumber[2]=0;
            				r=0;
            				cCircle.setCenterX(cx);
    					    cCircle.setCenterY(cy);
    					    t.setText("CLICK TURN BUTTON TO PLAY");
            				t2.setText("");
    					    System.out.println("turn finished");
            				}
            				}
            				});
                   
                   
                   ////////////////////////////////////////////////////////////////////////////////////////////////////

                   ////////////////////////////////////////////////////////////////////////////////////////////////////
                   
                   
                   
                   /////////////////////////////////////////////////////////////////////////////////////////////////////
                   }
                   if(r==0){
                   	int flag2=1;
                       do{		
           					for(int i=0;i<3;i++){
           						getNumber2[i]=6-rn.nextInt(6);
           						if(
           								getNumber2[2]==6){
           								getNumber2[0]=0;
           								getNumber2[1]=0;
           								getNumber2[2]=0;
           								i=-1;
           						}
           						else if(getNumber2[i]!=6){
           							    flag2=0;
           								break;
           						}
           					}
           				}while(flag2==1);
                       ////////////////////////////////////////////////////////////////////////////////////////////////////
                       
                       if((getNumber2[0]==6 || getNumber2[1]==6 )){
                           // loop = checking 4 coins in box
                   		//getNumber = input number
                           	int k=0;
                   		for(int i=0;i<3 && k==0;i++){
                   			if (getNumber2[i]==6){   
           				    	    t.setFont(new Font(16));
           				    	  	if( ox==420 && oy==143){
           				    	  		ox=370;
           				    	  		oy=180;
           				    	  		player1[0]=1;
           				    	  		One.setCenterX(ox);
           				    	  		One.setCenterY(oy);
           				    	  		getNumber2[i]=1;
           				    	  	}
           				    	  	else if(tx==470 && ty==143){
           					    	  	tx=370;
           				    	  		ty=180;
           				    	  		player1[1]=1;
           					    	  	Two.setCenterX(tx);
           					    	  	Two.setCenterY(ty);
           					    	  	getNumber2[i]=1;
           				    	  	}
           				    	  	else if(thx==520 && thy==143){
           					    	  	thx=370;
           				    	  		thy=180;
           				    	  		player1[2]=1;
           				    	  		Three.setCenterX(thx);
           				    	  		Three.setCenterY(thy);
           				    	  		getNumber2[i]=1;
           				    	  	}
           				    	  	else if(fx==570 && fy==143){
           					    	  	fx=370;
           				    	  		fy=180;
           				    	  		player1[3]=1;
           				    	  		Four.setCenterX(fx);
           				    	  		Four.setCenterY(fy);
           				    	  		getNumber2[i]=1;
           				    	  	}		    	
                   		}
                   		}
                   		
                           }	
                       ////////////////////////////////////////////////////////////////////////////////////////////////////
                       if((player1[0]==1 || player1[0]==2) && (player1[1]==1 || player1[1]==2) && (player1[2]==1 || player1[2]==2) && (player1[3]==1 || player1[3]==2)  && getNumber2[0]!=6 && getNumber2[1]!=6){
                       	getNumber2[0]=0;
           				getNumber2[1]=0;
           				getNumber2[2]=0;
           				r=1;
                       }
                       if(player1[0] ==1 || player1[1]==1 || player1[2]==1 || player1[3]==1 && (player1[0]!=2 && player1[1]!=2 && player1[2]!=0) ){
           				int[] coinTurn = new int[4];
           				int no2=0;
           			for(int i=0;i<4;i++){
           				if(player1[i]==1 && player1[i]!=2){
           					coinTurn[no2]=i;
           					no2++;
           				}
           			}
           			
           			int instant=-1;
           			int x2=0;
           				if(no2>0){
           					instant = coinTurn[rn.nextInt(no2)];
           					x2=getNumber2[0]+getNumber2[1]+getNumber2[2];
           					getNumber2[0]=0;
           					getNumber2[1]=0;
           					getNumber2[2]=0;	
           					r=1;
           				}
           			if(instant==0){
           				while(ox==370 && oy<320 && x2!=0){
           					oy = oy+35;
           					x2--;
           					System.out.println(ox+" :::"+oy);
           				}
           				if(ox==370 && oy==320 && x2!=0){
           					ox =ox+35;
           					oy=oy+35;
           					x2--;
           					System.out.println(ox+" :::"+oy);
           				}
           				while(ox>355 && ox<580 && oy==355 && x2!=0){
           					ox =ox+35;
           					x2--;
           					System.out.println(ox+" ;::"+oy);
           				}
           				while(ox==580 && oy<425 && x2!=0){
           					oy =oy+35;
           					x2--;
           					System.out.println(ox+" :::"+oy);
           				}
           				while(ox>405 && oy==425 && x2!=0){
           					ox =ox-35;
           					x2--;
           					System.out.println(ox+" :::"+oy);
           				}
           				if(ox==405 && oy==425 && x2!=0){
           					ox=ox-35;
           					oy=oy+35;
           					x2--;
           					System.out.println(ox+" :::"+oy);
           				}
           				while(ox==370 && oy<635 && x2!=0){
           					oy=oy+35;
           					x2--;
           					System.out.println(ox+" :::"+oy);
           				}
           				while(ox>300 && oy==635 && x2!=0){
           					ox=ox-35;
           					x2--;
           					System.out.println(ox+" :::"+oy);
           				}
           				//
           				while(ox==300 && oy>460 && x2!=0){
           					oy = oy-35;
           					x2--;
           					System.out.println(ox+" ::"+oy);
           				}
           				if(ox==300 && oy==460 && x2!=0){
           					ox = ox-35;
           					oy = oy-35;
           					x2--;
           					System.out.println(ox+" ::"+oy);
           				}
           				while(ox >90 && oy==425 && ox<300 && x2!=0){
           					ox =ox-35;
           					x2--;
           					System.out.println(ox+" ::"+oy);
           				}
           				while(ox==90 && oy>355 && x2!=0){
           					oy =oy-35;
           					x2--;
           					System.out.println(ox+" ::"+oy);
           				}
           				while(ox<265 && oy==355 && x2!=0){
           					ox =ox+35;
           					x2--;
           					System.out.println(ox+" ::"+oy);
           				}
           				if(ox==265 && oy==355 && x2!=0){
           					ox =ox+35;
           					oy =oy-35;
           					x2--;
           					System.out.println(ox+" ::"+oy);
           				}
           				while(ox==300 && oy>145 && oy<355 && x2!=0){
           					oy=oy-35;
           					x2--;
           					System.out.println(ox+" ::"+oy);
           				}
           				if(ox==300 && oy==145 && x2!=0){
           					ox = ox+35;
           					x2--;
           					System.out.println(ox+" ::"+oy);
           				}
           				while(ox==335 && oy<355 && x2!=0){
           					oy = oy+35;
           					x2--;
           					System.out.println(ox+" :::"+oy);
           				}
           				if(tx==335 && ty==355){
           					player1[0]=2;
           				}
           				if(ox==rx && oy==ry){
           					rx=70;
           					ry=660;
           					player2[0]=0;
           					rCircle.setCenterX(rx);
           			        rCircle.setCenterY(ry);
           				}
           				else if(ox==bx && oy==by){
           					bx=123;
           					by=660;
           					player2[1]=0;
           					bCircle.setCenterX(bx);
           			        bCircle.setCenterY(by);
           				}
           				else if(ox==gx && oy==gy){
           					gx=175;
           					gy=660;
           					player2[2]=0;
           					gCircle.setCenterX(gx);
           			        gCircle.setCenterY(gy);
           				}
           				else if(ox==cx && oy==cy){
           					cx=225;
           					cy=660;
           					player2[3]=0;
           					cCircle.setCenterX(cx);
           			        cCircle.setCenterY(cy);
           				}
           				//
           				One.setCenterX(ox);
            	  		One.setCenterY(oy);
           			}
           			if(instant==1){
           				while(tx==370 && ty<320 && x2!=0){
           					ty = ty+35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				if(tx==370 && ty==320 && x2!=0){
           					tx =tx+35;
           					ty=ty+35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				while(tx>355 && tx<580 && ty==355 && x2!=0){
           					tx =tx+35;
           					x2--;
           					System.out.println(tx+" ;::"+ty);
           				}
           				while(tx==580 && ty<425 && x2!=0){
           					ty =ty+35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				while(tx>405 && ty==425 && x2!=0){
           					tx =tx-35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				if(tx==405 && ty==425 && x2!=0){
           					tx=tx-35;
           					ty=ty+35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				while(tx==370 && ty<635 && x2!=0){
           					ty=ty+35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				while(tx>300 && ty==635 && x2!=0){
           					tx=tx-35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				//
           				while(tx==300 && ty>460 && x2!=0){
           					ty = ty-35;
           					x2--;
           					System.out.println(tx+":::"+ty);
           				}
           				if(tx==300 && ty==460 && x2!=0){
           					tx = tx-35;
           					ty = ty-35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				while(tx >90 && ty==425 && tx<300 && x2!=0){
           					tx =tx-35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				while(tx==90 && ty>355 && x2!=0){
           					ty =ty-35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				while(tx<265 && ty==355 && x2!=0){
           					tx =tx+35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				if(tx==265 && ty==355 && x2!=0){
           					tx =tx+35;
           					ty =ty-35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				while(tx==300 && ty>145 && ty<355 && x2!=0){
           					ty=ty-35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				if(tx==300 && ty==145 && x2!=0){
           					tx = tx+35;
           					x2--;
           					System.out.println(tx+" ::"+ty);
           				}
           				while(tx==335 && ty<355 && x2!=0){
           					ty = ty+35;
           					x2--;
           					System.out.println(tx+" :::"+ty);
           				}
           				if(tx==335 && ty==355){
           					player1[1]=2;
           				}
           				if(tx==rx && ty==ry){
           					rx=70;
           					ry=660;
           					player2[0]=0;
           					rCircle.setCenterX(rx);
           			        rCircle.setCenterY(ry);
           				}
           				else if(tx==bx && ty==by){
           					bx=123;
           					by=660;
           					player2[1]=0;
           					bCircle.setCenterX(bx);
           			        bCircle.setCenterY(by);
           				}
           				else if(tx==gx && ty==gy){
           					gx=175;
           					gy=660;
           					player2[2]=0;
           					gCircle.setCenterX(gx);
           			        gCircle.setCenterY(gy);
           				}
           				else if(tx==cx && ty==cy){
           					cx=225;
           					cy=660;
           					player2[3]=0;
           					cCircle.setCenterX(cx);
           			        cCircle.setCenterY(cy);
           				}
           				//
           				Two.setCenterX(tx);
            	  		Two.setCenterY(ty);
           			}
           			
           			else if(instant==2){
           				while(thx==370 && thy<320 && x2!=0){
           					thy = thy+35;
           					x2--;
           					System.out.println(thx+" :::"+thy);
           				}
           				if(thx==370 && thy==320 && x2!=0){
           					thx =thx+35;
           					thy=thy+35;
           					x2--;
           					System.out.println(thx+" :::"+thy);
           				}
           				while(thx>355 && thx<580 && thy==355 && x2!=0){
           					thx =thx+35;
           					x2--;
           					System.out.println(thx+" ;::"+thy);
           				}
           				while(thx==580 && thy<425 && x2!=0){
           					thy =thy+35;
           					x2--;
           					System.out.println(thx+" :::"+thy);
           				}
           				while(thx>405 && thy==425 && x2!=0){
           					thx =thx-35;
           					x2--;
           					System.out.println(thx+" :::"+thy);
           				}
           				if(thx==405 && thy==425 && x2!=0){
           					thx=thx-35;
           					thy=thy+35;
           					x2--;
           					System.out.println(thx+" :::"+thy);
           				}
           				while(thx==370 && thy<635 && x2!=0){
           					thy=thy+35;
           					x2--;
           					System.out.println(thx+" :::"+thy);
           				}
           				while(thx>300 && thy==635 && x2!=0){
           					thx=thx-35;
           					x2--;
           					System.out.println(thx+" :::"+thy);
           				}
           				//
           				while(thx==300 && thy>460 && x2!=0){
           					thy = thy-35;
           					x2--;
           					System.out.println(thx+" ::"+thy);
           				}
           				if(thx==300 && thy==460 && x2!=0){
           					thx = thx-35;
           					thy = thy-35;
           					x2--;
           					System.out.println(thx+" ::"+thy);
           				}
           				while(thx >90 && thy==425 && thx<300 && x2!=0){
           					thx =thx-35;
           					x2--;
           					System.out.println(thx+" ::"+thy);
           				}
           				while(thx==90 && thy>355 && x2!=0){
           					thy =thy-35;
           					x2--;
           					System.out.println(thx+" ::"+thy);
           				}
           				while(thx<265 && thy==355 && x2!=0){
           					thx =thx+35;
           					x2--;
           					System.out.println(thx+" ::"+thy);
           				}
           				if(thx==265 && thy==355 && x2!=0){
           					thx =thx+35;
           					thy =thy-35;
           					x2--;
           					System.out.println(thx+" ::"+thy);
           				}
           				while(thx==300 && thy>145 && thy<355 && x2!=0){
           					thy=thy-35;
           					x2--;
           					System.out.println(thx+" ::"+thy);
           				}
           				if(thx==300 && thy==145 && x2!=0){
           					thx = thx+35;
           					x2--;
           					System.out.println(thx+" ::"+thy);
           				}
           				while(thx==335 && thy<355 && x2!=0){
           					thy = thy+35;
           					x2--;
           					System.out.println(thx+" :::"+thy);
           				}
           				if(thx==335 && thy==355){
           					player1[2]=2;
           				}
           				if(thx==rx && thy==ry){
           					rx=70;
           					ry=660;
           					player2[0]=0;
           					rCircle.setCenterX(rx);
           			        rCircle.setCenterY(ry);
           				}
           				else if(thx==bx && thy==by){
           					bx=123;
           					by=660;
           					player2[1]=0;
           					bCircle.setCenterX(bx);
           			        bCircle.setCenterY(by);
           				}
           				else if(thx==gx && thy==gy){
           					gx=175;
           					gy=660;
           					player2[2]=0;
           					gCircle.setCenterX(gx);
           			        gCircle.setCenterY(gy);
           				}
           				else if(thx==cx && thy==cy){
           					cx=225;
           					cy=660;
           					player2[3]=0;
           					cCircle.setCenterX(cx);
           			        cCircle.setCenterY(cy);
           				}
           				//
           				Three.setCenterX(thx);
            	  		Three.setCenterY(thy);
           			}
           			
           			else if(instant==3){
           				while(fx==370 && fy<320 && x2!=0){
           					fy = fy+35;
           					x2--;
           					System.out.println(fx+" :::"+fy);
           				}
           				if(fx==370 && fy==320 && x2!=0){
           					fx =fx+35;
           					fy=fy+35;
           					x2--;
           					System.out.println(fx+" :::"+fy);
           				}
           				while(fx>355 && fx<580 && fy==355 && x2!=0){
           					fx =fx+35;
           					x2--;
           					System.out.println(fx+" ;::"+fy);
           				}
           				while(fx==580 && fy<425 && x2!=0){
           					fy =fy+35;
           					x2--;
           					System.out.println(fx+" :::"+fy);
           				}
           				while(fx>405 && fy==425 && x2!=0){
           					fx =fx-35;
           					x2--;
           					System.out.println(fx+" :::"+fy);
           				}
           				if(fx==405 && fy==425 && x2!=0){
           					fx=fx-35;
           					fy=fy+35;
           					x2--;
           					System.out.println(fx+" :::"+fy);
           				}
           				while(fx==370 && fy<635 && x2!=0){
           					fy=fy+35;
           					x2--;
           					System.out.println(fx+" :::"+fy);
           				}
           				while(fx>300 && fy==635 && x2!=0){
           					fx=fx-35;
           					x2--;
           					System.out.println(fx+" :::"+fy);
           				}
           				//
           				while(fx==300 && fy>460 && x2!=0){
           					fy = fy-35;
           					x2--;
           					System.out.println(fx+" ::"+fy);
           				}
           				if(fx==300 && fy==460 && x2!=0){
           					fx = fx-35;
           					fy = fy-35;
           					x2--;
           					System.out.println(fx+" ::"+fy);
           				}
           				while(fx >90 && fy==425 && fx<300 && x2!=0){
           					fx =fx-35;
           					x2--;
           					System.out.println(fx+" ::"+fy);
           				}
           				while(fx==90 && fy>355 && x2!=0){
           					fy =fy-35;
           					x2--;
           					System.out.println(fx+" ::"+fy);
           				}
           				while(fx<265 && fy==355 && x2!=0){
           					fx =fx+35;
           					x2--;
           					System.out.println(fx+" ::"+fy);
           				}
           				if(fx==265 && fy==355 && x2!=0){
           					fx =fx+35;
           					fy =fy-35;
           					x2--;
           					System.out.println(fx+" ::"+fy);
           				}
           				while(fx==300 && fy>145 && fy<355 && x2!=0){
           					fy=fy-35;
           					x2--;
           					System.out.println(fx+" ::"+fy);
           				}
           				if(fx==300 && fy==145 && x2!=0){
           					fx = fx+35;
           					x2--;
           					System.out.println(fx+" ::"+fy);
           				}
           				while(fx==335 && fy<355 && x2!=0){
           					fy = fy+35;
           					x2--;
           					System.out.println(fx+" :::"+fy);
           				}
           				if(fx==335 && fy==355){
           					player1[3]=2;
           				}
           				if(fx==rx && fy==ry){
           					rx=70;
           					ry=660;
           					player2[0]=0;
           					rCircle.setCenterX(rx);
           			        rCircle.setCenterY(ry);
           				}
           				else if(fx==bx && fy==by){
           					bx=123;
           					by=660;
           					player2[1]=0;
           					bCircle.setCenterX(bx);
           			        bCircle.setCenterY(by);
           				}
           				else if(fx==gx && fy==gy){
           					gx=175;
           					gy=660;
           					player2[2]=0;
           					gCircle.setCenterX(gx);
           			        gCircle.setCenterY(gy);
           				}
           				else if(fx==cx && fy==cy){
           					cx=225;
           					cy=660;
           					player2[3]=0;
           					cCircle.setCenterX(cx);
           			        cCircle.setCenterY(cy);
           				}
           				//
           				Four.setCenterX(fx);
            	  		Four.setCenterY(fy);
           			}
           			if(player1[0]==2 && player1[1]==2 && player1[2]==2 && player1[3]==2){
           				win=2;
           				t2.setText("");
           				t.setText("Computer Win");
           			}
                       }
                   }
            });
        
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////   
        

        Pane root = new Pane();
        root.getChildren().addAll(img,turn,unbox,eat,red,blue,green,chocolate,rCircle,bCircle,gCircle,cCircle,t,t2,One,Two,Three,Four);
        
        Scene scene = new Scene(root,680, 680);
        
        primaryStage.setTitle("Ludu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
