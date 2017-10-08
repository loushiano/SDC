using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using System;

public class Velocity : MonoBehaviour {

		private double velocity;
		private Rigidbody rb;
		private GUIStyle style = new GUIStyle();
		private bool hasAssignedStyleProperties = false;

	// Returns the velocity of the car in km/h
	double getCarVelocity(){
		velocity = rb.velocity.magnitude*3.6;
		return RoundToSignificantDigits(velocity, 3);

	}
	
	// Used to round the velocity to a certain number of significant figures
	double RoundToSignificantDigits(double d, int digits){
		if(d == 0 || d < 1)
		return 0;
		
		double scale = Math.Pow(10, Math.Floor(Math.Log10(Math.Abs(d))) + 1);
		return scale * Math.Round(d / scale, digits);
		}

	// OnGUI is called several times per frame to update the speedometer
	void OnGUI(){
		if (!hasAssignedStyleProperties){
			
             style.normal.background = GUI.skin.textField.normal.background;
             style.active.background = GUI.skin.textField.active.background;
             style.hover.background = GUI.skin.textField.hover.background;
             style.focused.background = GUI.skin.textField.hover.background;
   
             hasAssignedStyleProperties = true;
         }
		GUI.Label(new Rect (Screen.width - 100,Screen.height - 50,100,50), getCarVelocity().ToString() + "\nkm/h", style);
	}

	// Use this for initialization
	void Start () {
		rb = GetComponent<Rigidbody>();
		style.fontSize = 20;
		style.normal.textColor = Color.white;
	}
	
	// Update is called once per frame
	void Update () {

	}
}
