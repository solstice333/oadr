# EnerNOC OpenADR 2.0 Reference Implementation #

This is part of EnerNOC's open source reference implementation for the OpenADR 2.0 spec. Credit goes to Thom Nichols for oadr2-model and oadr2-xmpp submodules, and initial setup using Maven. Original source code here:

https://github.com/EnerNOC/oadr2-ven

See: http://openadr.org/

This project provides the building blocks for implementing a VEN client.  In particular,
it aims to provide protocol bindings.  It *does not* actually implement any service 
functionality (at least not yet.)  But it should provide enough at least for someone to 
start implementing OpenADR 2.0 services. 

## Modules ##

**oadr2-model** Simple JAXB Bindings

**oadr2-xmpp** XMPP client implementation

**oadr2-app** XMPP client application

**oadr2-http** HTTP client implementation (TODO)

**oadr2-vtn** This is a separate project: https://github.com/EnerNOC/oadr2-vtn


## Development, Build, Testing ##

Eclipse IDE for Java EE Developers - http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/keplersr1

(Comes with Maven Integration)

Note: Running Maven clean and then Maven compile, all within Eclipse, will cause resolution errors for classes that are correctly generated and/or existent within the correct package (seems to be a bug with the Maven plugin). To fix this, open the terminal, cd to the parent directory and run the setup script:

    ./setup


If you simply want to run the application and test it out, run it in the terminal directly - cd to the parent directory and execute "setup" and "run" inside the terminal. Login with your gmail account in the username field:

    ./setup
   
    ./run


## License ##

This code is released under the Apache 2.0 software license. Please take it and use the code in your (commercial or open source) product. Contributions back to this project are also welcome!
