Ethernet, IP, TCP, UDP, ICMP, DNS
====

DFDL Schemas for Ethernet and IP

It works with Daffodil (from Daffodil version 3.1.0), 
but not with IBM DFDL (as of 2021-06-08) as the latter does not yet support
the dfdl:inputValueCalc, dfdl:outputValueCalc, 
dfdl:hiddenGroupRef, dfdl:valueLength(), dfdl:contentLength(),
and dfdl:newVariableInstance DFDL capabilities.

This schema was created based on the corresponding DFDL types in the PCAP schema, which has been refactored to use this schema as a dependency.

This is intended to illustrate how to structure DFDL schemas as separate DFDL schemas that are combined together to form a complete format, and which involve layering where a container/envelope/header structure, contains a payload structure. PCAP is an container format for Ethernet/IP packets. 

