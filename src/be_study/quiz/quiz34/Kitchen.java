package be_study.quiz.quiz34;

import java.util.ArrayList;

public class Kitchen {
	
//	주방공간
//	- 공간이 몇평인지
//	- 벽지색상이 어떤지
//	- 층고가 얼마나 되는지
	
	int floorSpace; // 몇평 30평
	String wallColor; //벽지 색상  white gray
	int floorHeight; //층고높이  단위를 뭐로?  230cm  2300mm  2.3m
	
    Refrigerator refrigerator; //주방에 냉장고
    //Refrigerator[] refrigeratorArr; //주방에 냉장고가 여러대 있다?
    //ArrayList<Refrigerator> refrigeratorList; //주방에 냉장고가 여러대 있다?
    
    Sink sink;		     //주방에 싱크대
    GasRange gasRange;   //주방에 가스렌지
    
    //여러개 있을수 있다!! 
    //Cup[] cups;  
    //Cup[] cupArr;  cupArray;
    //동적으로 바뀌는 경우
    ArrayList<Cup> cupList;  //주방에 컵 여러개
    
    //쓰레기통 여러개
    //TrashCan[] trashCanArr;
    ArrayList<TrashCan> trashCanList; //주방에 쓰레기통 여러개
}
