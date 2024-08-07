Novabook Eureka
===============

* Eureka는 클라우드 환경에서 다수의 서비스, 예를 들어 API 서버들 간의 로드 밸런싱과 장애 조치를 지원하는 미들웨어 서버입니다.
* 로드 밸런싱: 서버가 여러 대일 때, 특정 서비스를 제공하는 서버에 트래픽이 집중되지 않도록 효율적으로 분산하는 기술입니다.
* 미들웨어: 데이터 전송의 중간에서 두 서비스(웹 클라이언트와 API 서버 등) 간의 상호작용을 중재하는 소프트웨어입니다.
* Eureka는 이러한 미들웨어 역할을 수행하며, 연결된 서비스의 IP 주소, 포트, 그리고 InstanceId를 관리하고, RESTful 방식으로 작동합니다.

<br>

Heartbeats
========
서비스가 Eureka Server에 등록할 때, 자신의 상태를 주기적으로 업데이트하여 살아있음을 알립니다.
Eureka Server는 다른 Eureka Client의 정보를 제공하며, 이 정보는 서비스의 로컬 캐시에 저장됩니다.
이후, 각 서비스는 기본적으로 30초마다 Eureka Server에 Heartbeats 요청을 보내고, Eureka Server는 90초 이내에 Heartbeats를 받지 못하면 해당 Eureka Client의 등록 정보를 제거합니다.

<br>


![스크린샷 2024-07-21 오후 8 08 16](https://github.com/user-attachments/assets/e15255e4-d134-4107-a0c9-f3409a0bb90b)
