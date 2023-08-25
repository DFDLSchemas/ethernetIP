Ethernet, IP, TCP, UDP, ICMP, DNS
====

DFDL Schemas for Ethernet and IP

It works with Daffodil (from Daffodil version 3.2.0), 
but not with IBM DFDL (as of 2021-06-08) as the latter does not yet support
the dfdl:inputValueCalc, dfdl:outputValueCalc, 
dfdl:hiddenGroupRef, dfdl:valueLength(), dfdl:contentLength(),
and dfdl:newVariableInstance DFDL capabilities.

This schema was created based on the corresponding DFDL types in the PCAP schema, which has been refactored
to use this schema as a dependency.

This division into two schemas is intended to illustrate how to structure DFDL schemas as separate DFDL 
schemas that are combined together to form a complete format, and which involve layering where a 
container/envelope/header structure, contains a payload structure. 
PCAP is a container format for Ethernet/IP packets. 

## Release Notes

### 1.2.0
Updated for Daffodil version 3.4.0

This schema is used as a component schema by the PCAP DFDL schema. 
Hence, a Daffodil 3.4.0 version of this schema is needed.

### 1.1.0
As of version 1.1.0 of this DFDL schema, it also uses a Daffodil-specific DFDL extension called layers in order
  to compute IPv4 checksums as part of parsing and unparsing.

Works with Daffoddil 3.2.1 