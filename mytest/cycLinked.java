package mytest;

public class cycLinked {

	// 环形链表
	public static void main(String[] args) {
		CyclinedList cyclinedList = new CyclinedList();
		cyclinedList.initBoys(5);
		cyclinedList.showBoys();
		cyclinedList.jumpBoys2(1, 2);
		// 約瑟夫問題
         /*		
         n个人(n<=100)围成一圈,从第一个人开始报数,数到m的人出列,
		再由下一个人重新从1开始报数,数到m的人再出圈,……依次类推,直到所有的人都出圈,请输出依次出圈人的编号.
	 */
	}

}

class CyclinedList {
    Boy first = null;
    Boy currBoy = null;

	
	// 初始化小孩的个数
	public void initBoys(int  nums ) {
        if(nums < 1){
        	return;
        } 
      
        for (int i = 1; i <= nums; i++) {
        	  Boy tmp = new Boy(i);
			if(i == 1){
				first= tmp;
				first.setNext(tmp);
				currBoy = tmp;
			}else{
				tmp.setNext(first);
				currBoy.setNext(tmp);
				currBoy= tmp;
			}
		} 
        System.out.println("currBoy ====="+ currBoy);
	}
	
	/**
	 * 
	 * @param k 從k開始
	 * @param m m個
	 */
	public void jumpBoys2(int k, int m) {
		if(first ==null){
			return;
		}
		Boy helper = first;
		// helper  为 最后一个boy
		while (true ) {
			if(helper.next == first){
				break;
			}
			helper = helper.next;
		}
		System.out.println("最后一个boy 为" + helper);
		
		
		int tempk = 0 ;
		int tempm = 0 ;
		// boy 为 k 的前一个节点
		while (true ) {
			if((tempk + 1) == k){
				break;
			}
			tempk ++;
			helper = helper.next;
		}
		
		// 此时每 M 个跳出一个 , 只有一个boy 是停止循环
		while (helper.next != helper) {
			helper = helper.next; 
			tempm ++;
			if(m == (tempm+1) ){
				// 将此 boy 跳出
				System.out.println("跳出boy 编号  : " + helper.next);
				helper.next = 	helper.next.next ;
				tempm = 0;
			}
		}
		System.out.println("最后一个boy 是 :" + helper);
		
		
	}
	
	/**
	 * 
	 * @param k 從k開始
	 * @param m m個
	 */
	public void jumpBoys(int k, int m) {
		if(first ==null){
			return;
		}
		
		Boy boy = first;
		int tempk = 0 ;
		int tempm = 0 ;
      
		// boy 为 k 的前一个节点
		while (boy.next != first ) {
			if((boy.no + 1) == k){
				break;
			}
			tempk ++;
			boy = boy.next;
		}
		System.out.println("k 的前一个boy 为" +boy);
		
		// 此时每 M 个跳出一个 , 只有一个boy 是停止循环
		while (boy.next != boy) {
			boy = boy.next; 
			tempm ++;
			if(m == (tempm+1) ){
				// 将此 boy 跳出
				System.out.println("跳出boy 编号  : " + boy.next);
				boy.next = 	boy.next.next ;
				tempm = 0;
			}
		}
		System.out.println("最后一个boy 是 :" + boy);
		
		
	}
	

	
	public void showBoys() {
		if(first ==null){
			return;
		}
		Boy boy = first;
		
		while (boy.getNext() != first ) {
			System.out.println(boy);
			boy = boy.getNext();	
		}
		System.out.println(boy);
		
	}

}

class Boy {
	public int no;
	public Boy next;

	public Boy(int no) {
		// TODO Auto-generated constructor stub
		this.no = no;
	}
	
	

	@Override
	public String toString() {
		return "Boy no=" + no;
	}



	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Boy getNext() {
		return next;
	}

	public void setNext(Boy next) {
		this.next = next;
	}
	
	
	

}
