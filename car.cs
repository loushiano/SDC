using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class car : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		
			
		if(transform.position.z-GameObject.Find("bob").transform.position.z<13){
			transform.Translate(-3*Time.deltaTime,0,0,Space.Self);
			foreach (Transform child in transform) {
			
            child.Translate(-3*Time.deltaTime,0,0,Space.Self);
        
        }
		}
		else {
			transform.Translate(0,0,5*Time.deltaTime,Space.Self);
		
		foreach (Transform child in transform) {
			
            child.Translate(0,0,10*Time.deltaTime,Space.Self);
        
        }
		}
		}

}
