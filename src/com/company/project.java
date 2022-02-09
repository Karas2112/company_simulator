package com.company;

public class project {
    String name;
    client client;
    double deadline;
    int penalty;
    int remuneration;
    String remuneration_date;
    String level;

    public static project[] list_of_projects;

    public project(String name, client client, double deadline, int penalty, int remuneration, String remuneration_date, String level){
        this.name = name;
        this.client = client;
        this.deadline = deadline;
        this.penalty = penalty;
        this.remuneration = remuneration;
        this.remuneration_date = remuneration_date;
        this.level = level;
        if(this.client.group == "wyluzowany"){

        }
        else if(this.client.group == "wymagajacy"){

        }
        else if(this.client.group == "skrwl"){

        }
    }





}
