class Factory {
     Iplannouncement teamselector(String team)
     {
        if(team.equalsIgnoreCase("CSk"))
        {
            return new Csk();
        }
        else if(team.equalsIgnoreCase("RCB"))
        {
            return new Csk();
        }

        else if(team.equalsIgnoreCase("Mi"))
        {
            return new Csk();
        }
        System.out.println("Unknown team name!!!");
       return null;

        
     }
}
