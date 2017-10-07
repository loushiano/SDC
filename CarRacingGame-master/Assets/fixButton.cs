using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
 using UnityEngine.Events;
 using UnityEngine.EventSystems;
using UnityEngine;

public class fixButton : MonoBehaviour {
	private Button[] buttons;
	private string text =null;
	// Use this for initialization
	void Start () {
		buttons = GetComponentsInChildren<Button>();
		
		foreach(Button b in buttons){
			b.onClick.AddListener(TaskOnClick);
		}
	}
	
	// Update is called once per frame
	void Update () {
		
	}
	void TaskOnClick()
    {
		Debug.Log(buttons.Length);
        Debug.Log("You have clicked the button!");
    }
}
