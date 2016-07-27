package pubSubV1;

public class Pub {

}








/*
int cur_time;
//class Program;
class Subscriber{
        string name;
        public:
        Subscriber(string n){
                name  = n;
        }
        string getName(){
                return this->name;
        }
        void update(class Program *p);
};

class Program{
        vector<Subscriber *> list;
        string name;
		int time;

        public:
        Program(string n, int t){
		  name = n;
		  time = t;
		}
        void addSbs(Subscriber *sbs){
                list.push_back(sbs);
        }
        void removeSbs(Subscriber *sbs){
			for(int i=0; i< list.size(); i++){
				if(list.at(i)->getName() == sbs->getName()){
		            list.erase(list.begin()+i);
		            return;
	            }
	        }
        }
        string getName(){
                return name;
        }
        void setName(string n){
                name = n;
        }
        void setTime(int t){
	        time =t;
		}
        int getTime(){
		return time;
		}
        vector<Subscriber *> getSubscriberList(){
		return list;		
		}
        void notify(){
		    cout<<"Notifying subscribers for program : " <<getName()<<"\n";
		    for(int i=0;i<list.size();i++){
				Subscriber *s = list.at(i);
				s->update(this);	
		    }
		}
};

void Subscriber::update(Program *p)
{
     cout<<"Program : "<<p->getName()<<" will run for subscriber "<<getName()<<"\n";
}


class tvsystem
{
  vector<Program *> programs;

  public:
  static tvsystem *getInstance();
  {
	if(instance == NULL)
	  tvsystem *instance = new tvsystem();
	 return instance;
  }

  void addProgram(Program *p)
  {
   programs.push_back(p);
   cout<<"Program added"<<"\n";
   return;
  }
  
  void addSubscriber(Subscriber *s, Program p)
  {
	bool not_found = true;
	for(int i=0;i<programs.size(); i++)
	{
	  Program *obj = programs.at(i);
	  if(obj->getName() == p.getName())
	  {
		obj->addSbs(s);
		cout<<"Subscriber added"<<"\n";
		not_found = false;
		break;
	  }
 	}
        if(not_found)
	   cout<<"This program is not available"<<"\n";
  	return;
  }
  
  void removeSubscriber(Subscriber *sbs, Program *p)
  {
     for(int i=0;i<programs.size(); i++)
     {
          Program *obj = programs.at(i);
	  if(obj->getName() == p->getName())
          {
		obj->removeSbs(sbs);
          }
     }

     cout<<"Subscriber not found"<<"\n";

  }

  void displayPrognSubs()
  {
     for(int i=0;i<programs.size(); i++)
     {
          Program *obj = programs.at(i);
	  cout<<"Program name : " << obj->getName()<< "\n";
            vector<Subscriber *> s = obj->getSubscriberList();
            for(int j=0; j< s.size(); j++)
            {
		cout<<"Subscriber name : " << s.at(j)->getName()<<"\n";
            }
     }
  }
  
  void notifySubscriber()
  {
	for(int i=0;i<programs.size();i++)
	{
	     Program *p = programs.at(i);
             if(cur_time + 15 == p->getTime())
             {
		p->notify();		
             }
	}	
  }
};

 /* tvsystem::tvsystem *getInstance()
  {
        if(instance == NULL)
          tvsystem *instance = new tvsystem();

        return instance;
  }


int main(){
 Program p1("Friends", 20);
 Program p2("Breaking Bad", 35);
 Subscriber s1("xyz");
 Subscriber s2("abc");
 Subscriber s3("123");
 //tvsystem::getInstance()->addProgram(p1);
// tvsystem::getInstance()->addProgram(p2);
  tvsystem t;
  t.addProgram(&p1);
  t.addProgram(&p2);
  t.addSubscriber(&s1, p1);
  t.addSubscriber(&s2, p2);
  t.addSubscriber(&s3, p2);
  t.addSubscriber(&s3, p1);
  t.displayPrognSubs();  

  t.removeSubscriber(&s3, &p2);
  t.displayPrognSubs();

  t.notifySubscriber();
}

*/
