using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class carMovement : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		transform.Translate(0,0,10*Time.deltaTime,Space.Self);
		foreach(Transform child in transform){
			child.Translate(0,0,10*Time.deltaTime,Space.Self);
			
		}
	}
}
