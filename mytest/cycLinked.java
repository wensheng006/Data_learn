package mytest;

public class cycLinked {

	// ��������
	public static void main(String[] args) {
		CyclinedList cyclinedList = new CyclinedList();
		cyclinedList.initBoys(5);
		cyclinedList.showBoys();
		cyclinedList.jumpBoys2(1, 2);
		// �sɪ���}
    /*		
         n����(n<=100)Χ��һȦ,�ӵ�һ���˿�ʼ����,����m���˳���,
		������һ�������´�1��ʼ����,����m�����ٳ�Ȧ,������������,ֱ�����е��˶���Ȧ,��������γ�Ȧ�˵ı��.
		*/
		
		
		
		
		
		
		
		
		
	}

}

class CyclinedList {
    Boy first = null;
    Boy currBoy = null;

	
	// ��ʼ��С���ĸ���
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
	 * @param k ��k�_ʼ
	 * @param m m��
	 */
	public void jumpBoys2(int k, int m) {
		if(first ==null){
			return;
		}
		Boy helper = first;
		// helper  Ϊ ���һ��boy
		while (true ) {
			if(helper.next == first){
				break;
			}
			helper = helper.next;
		}
		System.out.println("���һ��boy Ϊ" + helper);
		
		
		int tempk = 0 ;
		int tempm = 0 ;
		// boy Ϊ k ��ǰһ���ڵ�
		while (true ) {
			if((tempk + 1) == k){
				break;
			}
			tempk ++;
			helper = helper.next;
		}
		
		// ��ʱÿ M ������һ�� , ֻ��һ��boy ��ֹͣѭ��
		while (helper.next != helper) {
			helper = helper.next; 
			tempm ++;
			if(m == (tempm+1) ){
				// ���� boy ����
				System.out.println("����boy ���  : " + helper.next);
				helper.next = 	helper.next.next ;
				tempm = 0;
			}
		}
		System.out.println("���һ��boy �� :" + helper);
		
		
	}
	
	/**
	 * 
	 * @param k ��k�_ʼ
	 * @param m m��
	 */
	public void jumpBoys(int k, int m) {
		if(first ==null){
			return;
		}
		
		Boy boy = first;
		int tempk = 0 ;
		int tempm = 0 ;
      
		// boy Ϊ k ��ǰһ���ڵ�
		while (boy.next != first ) {
			if((boy.no + 1) == k){
				break;
			}
			tempk ++;
			boy = boy.next;
		}
		System.out.println("k ��ǰһ��boy Ϊ" +boy);
		
		// ��ʱÿ M ������һ�� , ֻ��һ��boy ��ֹͣѭ��
		while (boy.next != boy) {
			boy = boy.next; 
			tempm ++;
			if(m == (tempm+1) ){
				// ���� boy ����
				System.out.println("����boy ���  : " + boy.next);
				boy.next = 	boy.next.next ;
				tempm = 0;
			}
		}
		System.out.println("���һ��boy �� :" + boy);
		
		
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
