#include<iostream>
#include<string>

using namespace std;
class FlyBehaviour;
class FlyBehaviour{
public:
	string virtual fly()=0;
};

class FlyWithWings : public FlyBehaviour{
public:
	string fly(){
		return "I am flying with wings";
	}

};

class FlyNoFly : public FlyBehaviour{
public:
	string fly(){
		return "I can't fly";
	}

};

class Batta {
private:
	int id;
	string name;
	static int counter;
protected:
	FlyBehaviour* myFlyBehaviour;
public:
	Batta(){
		this->id=counter++;
		this->name = string("Batta#")+ to_string(this->id);
		this-> myFlyBehaviour=new FlyWithWings;
	}
	string swim(){
		return "I am swiming";
	}
	void perform(){
		cout<<"****"<<endl;
		cout<<"Hi I am "+this->name<<endl;
		cout<<this->swim()<<endl;
		cout<<this->display()<<endl;
		cout<<this->myFlyBehaviour->fly()<<endl;
	}
	string virtual display() =0;
	~Batta(){
		delete myFlyBehaviour;
	}
};

int Batta::counter=0;


class Mo7bata : public Batta {
public:
	string display(){
		return"I am Mo7bata!";
	}

	void gotshot(){
		this->myFlyBehaviour=new FlyNoFly;
	}

};

class Le3ba : public Batta {
public:
	Le3ba(){
		delete myFlyBehaviour;
		this->myFlyBehaviour=new FlyNoFly();
	}
	string display(){
		return"I am Le3ba!";
	}

};

int main(){

	Batta* b1 =new Le3ba();
	b1->perform();

	Batta* b2=new Mo7bata();
	b2->perform();

	((Mo7bata*)b2)->gotshot();
	b2->perform();

	system("pause");
}