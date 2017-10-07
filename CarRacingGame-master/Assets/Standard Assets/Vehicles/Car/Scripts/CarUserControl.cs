using System;
using UnityEngine;
using UnityStandardAssets.CrossPlatformInput;
using Random =UnityEngine.Random;

namespace UnityStandardAssets.Vehicles.Car
{
    [RequireComponent(typeof (CarController))]
	
    public class CarUserControl : MonoBehaviour
    {
        private CarController m_Car; // the car controller we want to use
		private bool hit=false;
		private bool firstTime=true;
		private int times=0;
		private string text=null;
		private int times2=0;
		float a,b,c;

        private void Awake()
        {
            // get the car controller
            m_Car = GetComponent<CarController>();
			
        }


        private void FixedUpdate()
        {
            // pass the input to the car!
            float h = CrossPlatformInputManager.GetAxis("Horizontal");
            float v = CrossPlatformInputManager.GetAxis("Vertical");
//#if !MOBILE_INPUT
  //          float handbrake = CrossPlatformInputManager.GetAxis("Jump");
    //        m_Car.Move(h, v, v, handbrake);
//#else
  //          m_Car.Move(h, v, v, 0f);
//#endif

		moveCar(text);
				
        }
		private void OnCollisionStay(Collision col)
        {
            // detect collision against other cars, so that we can take evasive action
			Debug.Log("we er");
			hit=true;
            
        }
		public void setText(string text){
			this.text=text;
		}
		
		
		
		public void moveCar(string text){
			if(text !=null && text.Equals("stupid mode")){
			if(!hit && firstTime){
			m_Car.Move(0.1f,0.9f,0f,0f);
			}else if(!hit && !firstTime){
				m_Car.Move(0.6f,0.9f,0f,0f);
				
				
			}else {
				
				m_Car.Move(0.2f,0.9f,-1f,0f);
				times++;
				if(times>100){
					times=0;
					hit=false;
					if(firstTime){
					firstTime=false;}
					else{
						firstTime=true;
					}
				}
				
			}
				}else if (text==null){
					
				}else{
					
					
					if(times2>50 || times2==0){
					 a=Random.Range(-0.1f,0.1f);
					
				     c=Random.Range(-1,1);
					times2=1;
					}
					times2++;
					m_Car.Move(a,1f,0f,0f);
					
					
					
					
					
				}
			
		}
		
    }
}
