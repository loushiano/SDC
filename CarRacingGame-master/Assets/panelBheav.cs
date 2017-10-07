using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using UnityStandardAssets.Vehicles.Car;
 using UnityEngine.Events;
 using UnityEngine.EventSystems;
using UnityEngine;

public class panelBheav : MonoBehaviour {
	private Button[] buttons;
	private string text =null;
	private CarUserControl cuc;
	// Use this for initialization
	void Start () {
		buttons = GetComponentsInChildren<Button>();
		Debug.Log(buttons.Length);
		int i=0;
		int j=1;
		int l=2;
		int k=-1;
		 cuc = GameObject.Find("Car (1)").GetComponent<CarUserControl>();
		foreach(Button b in buttons){
			if(k==-1){
			b.onClick.AddListener( () => TaskOnClick( i ) );
			}else if(k==0){
				b.onClick.AddListener( () => TaskOnClick( j ) );
			}else {
				b.onClick.AddListener( () => TaskOnClick( l ) );
			}
			k++;
		}
		
	}
	
	// Update is called once per frame
	void Update () {
		
	}
	void TaskOnClick(int index)
    {
		
        text=buttons[index].GetComponentInChildren<Text>().text;
		cuc.setText(text);
		GameObject.Destroy(this.gameObject);
    }
	
	string getTest(){
		return text;
	}
	
}
