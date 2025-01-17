# 직원 관리 시스템

## 개요
이 프로젝트는 자바 기반의 직원 관리 시스템으로, 다양한 직원들(개발자, 디자이너, 팀 리더)을 관리합니다. 각 직원은 자신의 역할에 따라 작업을 수행할 수 있으며, 팀 리더는 개발자와 디자이너의 역할을 모두 수행하면서 팀을 관리하고 평가할 수 있습니다.

## 주요 기능
- 개발자(Developer) 코드를 작성하고 디버깅하는 역할을 수행합니다.
- 디자이너(Designer): 인터페이스를 디자인하고, 디자인을 리뷰하는 역할을 수행합니다.
- 팀 리더(Team Leader): 개발자와 디자이너의 역할을 모두 수행하며, 프로젝트 관리 및 팀 평가를 담당합니다.

## 클래스 설명
### `Employee` (추상 클래스)
- 역할: 직원들의 공통 속성과 행위를 정의합니다.
- 속성:
  - `name`: 직원의 이름
  - `position`: 직원의 직급
- 메서드:
  - `getName()`: 직원의 이름을 반환합니다.
  - `getPosition()`: 직원의 직급을 반환합니다.

### `Developer` (개발자 클래스)
- 역할: 코드를 작성하고 디버깅합니다.
- 속성:
  - `language`: 개발자가 사용하는 프로그래밍 언어
- 메서드:
  - `writeCode()`: 코드를 작성합니다.
  - `debugCode()`: 코드를 디버깅합니다.

### `Designer` (디자이너 클래스)
- 역할: 인터페이스를 디자인하고 리뷰합니다.
- 속성:
  - `tool`: 디자이너가 사용하는 디자인 도구
- 메서드:
  - `designInterface()`: 인터페이스를 디자인합니다.
  - `reviewDesign()`: 디자인을 리뷰합니다.

### `TeamLeader` (팀 리더 클래스)
- 역할: 팀의 프로젝트를 관리하고 평가합니다.
- 속성:
  - `teamName`: 관리하는 팀 이름
  - `language`: 사용하는 프로그래밍 언어
  - `tool`: 사용하는 디자인 도구
- 메서드:
  - `writeCode()`
  - `debugCode()`
  - `designInterface()`
  - `reviewDesign()`
  - `manageProject()`
  - `evaluateTeam()`

## 배운 점
- 추상 클래스와 상속: 추상 클래스를 통해 공통된 속성과 메서드를 상속받으며, 이를 통해 코드 중복을 줄였습니다.
- 인터페이스 활용: 각 직책에 맞는 인터페이스를 정의하여, 역할 기반의 개발을 수행했습니다. 이를 통해 다양한 역할을 유연하게 구현할 수 있었습니다.
- **다형성과 캡슐화**: `instanceof`를 사용하여 객체의 유형을 판별하고, 적절한 메서드를 호출함으로써 다형성을 실현했습니다. 또한, 캡슐화를 통해 객체의 상태를 보호하고, 외부에서는 접근할 수 없게 하여 데이터 무결성을 유지했습니다.
- **팀 리더의 다중 역할**: 팀 리더가 여러 인터페이스를 구현함으로써, 다중 역할을 수행할 수 있었고, 이는 클래스의 확장성과 유연성을 증대시켰습니다.

이 프로젝트는 객체지향 설계 원칙을 실제로 적용해보고, 복잡한 시스템에서도 효과적으로 클래스와 인터페이스를 관리할 수 있는 방법을 배우는 데 큰 도움이 되었습니다.
